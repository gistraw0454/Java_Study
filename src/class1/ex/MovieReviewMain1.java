package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "dd";
        inception.review = "ddd";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "ab";
        aboutTime.review = "abd";

        System.out.println("제목: "+inception.title+"리뷰: "+inception.review);
        System.out.println("제목: "+aboutTime.title+"리뷰: "+aboutTime.review);

    }
}
