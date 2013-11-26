package hello;

import java.util.Date;

class CompSession {
	private Date date;
	private Time time;
	private int duration;
	private int repeatFrequency;
	private String lecturer;
	private int maxAttendance;
	private boolean compulsory;
	private String venue;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRepeatFrequency() {
		return repeatFrequency;
	}

	public void setRepeatFrequency(int repeatFrequency) {
		this.repeatFrequency = repeatFrequency;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public int getMaxAttendance() {
		return maxAttendance;
	}

	public void setMaxAttendance(int maxAttendance) {
		this.maxAttendance = maxAttendance;
	}

	public boolean isCompulsory() {
		return compulsory;
	}

	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

}