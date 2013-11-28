package psd3;

import java.util.ArrayList;

public class SessionList {
	private ArrayList<CompSession> sessionList;
	
	public SessionList(){
		sessionList = new ArrayList<CompSession>();
	}
	
	public SessionList(int type){
		sessionList = new ArrayList<CompSession>();
		if (type==0){
			sessionList.add(new CompSession(new Date("25/11/2013"), new Time("14:00"), 2, 7, "Jeremy Singer", 100, true, "Boyd Orr Lab"));
		}
		if (type>0){
			sessionList.add(new CompSession(new Date("26/11/2013"), new Time("14:00"), 2, 7, "Gethin Norman", 100, true, "Boyd Orr Lab"));
			sessionList.add(new CompSession(new Date("27/11/2013"), new Time("14:00"), 2, 7, "Joseph Sventek", 100, true, "Boyd Orr Lab"));
			sessionList.add(new CompSession(new Date("28/11/2013"), new Time("14:00"), 2, 7, "David Watt", 100, true, "Boyd Orr Lab"));
			sessionList.add(new CompSession(new Date("29/11/2013"), new Time("14:00"), 2, 7, "Matthew Chalmers", 100, true, "Boyd Orr Lab"));
		}
		if (type>1){
			sessionList.add(new CompSession(new Date("02/12/2013"), new Time("14:00"), 2, 7, "Jeremy Singer", 100, true, "Boyd Orr Lab"));
			sessionList.add(new CompSession(new Date("03/12/2013"), new Time("14:00"), 2, 7, "Gethin Norman", 100, true, "Boyd Orr Lab"));
			sessionList.add(new CompSession(new Date("04/12/2013"), new Time("14:00"), 2, 7, "Joseph Sventek", 100, true, "Boyd Orr Lab"));
			sessionList.add(new CompSession(new Date("05/12/2013"), new Time("14:00"), 2, 7, "David Watt", 100, true, "Boyd Orr Lab"));
			sessionList.add(new CompSession(new Date("06/12/2013"), new Time("14:00"), 2, 7, "Matthew Chalmers", 100, true, "Boyd Orr Lab"));
		}
	}
	
	public ArrayList<CompSession> getSessionList(){
		return sessionList;
	}
	
}