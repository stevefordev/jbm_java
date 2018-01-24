package vo;

public class Movie {

	//제목
	private String title;
	//상영시간
	private int runningTime;
	//장르
	private String genre;
	//줄거리
	private String story;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}
}
