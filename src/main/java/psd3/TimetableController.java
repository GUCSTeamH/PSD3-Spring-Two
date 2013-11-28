package psd3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TimetableController {
	
	@RequestMapping(value="/timetable")
	public String timetable(Model model) {
		return "timetable";
	}
	
	@RequestMapping(value="/timetablelist", method=RequestMethod.POST)
	public String timetableList(@RequestParam(value="type", required=false, defaultValue="0") String type, Model model) {
		model.addAttribute("timetable", new SessionList(Integer.parseInt(type)));
		return "timetablelist";
	}
	
}