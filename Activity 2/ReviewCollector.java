import java.util.ArrayList;

public class ReviewCollector {
	private ArrayList<ProductReview> reviewList;
	private ArrayList<String> productList;
	
	public ReviewCollector() {
		reviewList = new ArrayList<ProductReview>();
		productList = new ArrayList<String>();
	}

	public void addReview(ProductReview prodReview) {
		//part (a)
		reviewList.add(prodReview);
		
		String prodName = prodReview.getName();
		boolean nameIsFound = false;
		for (String n: productList) {
			if (n.equals(prodName)) {
				nameIsFound = true;
			}
		}
		if (!nameIsFound){
			productList.add(prodName);
		}
	}
	
	public int getNumGoodReviews(String prodName) {
		/*part b*/
	}
}
