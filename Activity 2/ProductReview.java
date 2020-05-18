//Written by Richard Ahn
public class ProductReview {
	private String name;
	private String review;
	
	public ProductReview (String pName, String pReview){
		name = pName;
		review = pReview;
	}
	/*Returns name of product*/
	public String getName() {
		return name;
	}
	/*Returns review of product*/
	public String getReview() {
		return review;
	}
}
