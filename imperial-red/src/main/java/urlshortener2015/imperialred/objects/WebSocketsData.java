package urlshortener2015.imperialred.objects;

public class WebSocketsData {

	private long clicks;
	private String clicksByCountry;
	
	
	public WebSocketsData(long clicks, String clicksByCountry) {
		this.clicks=clicks;
		this.clicksByCountry=clicksByCountry;
	}


	/**
	 * @return the clicks
	 */
	public long getClicks() {
		return clicks;
	}


	/**
	 * @param clicks the clicks to set
	 */
	public void setClicks(long clicks) {
		this.clicks = clicks;
	}


	/**
	 * @return the clicksByCountry
	 */
	public String getClicksByCountry() {
		return clicksByCountry;
	}


	/**
	 * @param clicksByCountry the clicksByCountry to set
	 */
	public void setClicksByCountry(String clicksByCountry) {
		this.clicksByCountry = clicksByCountry;
	}
}
