package ex02_Enum;

public enum Season {
	// 1.생성자에 값을 전달하는것과 같은 원리이다
		Spring("봄","spring"),
		Summer("여름","summer"),
		Fall("가을","fall"),
		Winter("겨울","winter");
	
	//public static final Item Spring = new Item("봄");
	
	// 3.필드에 전달
	private String season;
	private String e_season;
	// 2.전갈한 값을 생성자를 통해서 받고
	Season(String season, String e_season){
		this.season = season;
		this.e_season = e_season;
	}
	
	public String getSeason() {
		return season;
	}
	
	public String getE_Season() {
		return e_season;
	}
}
