package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "dd";
        inception.review = "ddd";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "ab";
        aboutTime.review = "abd";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("제목: "+review.title+"리뷰: "+review.review);
        }
    }
}
