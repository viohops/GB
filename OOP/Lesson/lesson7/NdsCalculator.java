package OOP.Lesson.lesson7;

//@Component
public class NdsCalculator {

    private NdsResolver ndsResolver;

//    private static NdsCalculator instance;

//    private NdsCalculator(NdsResolver ndsResolver) {
//        this.ndsResolver = ndsResolver;
//    }
//
//    public static NdsCalculator getInstance() {
//        if (instance == null) {
//            instance = new NdsCalculator(NdsResolver.getInstance());
//        }
//        return instance;
//    }

//    @Transactional
    public double withNds(double price) {
        return ndsResolver.getNds() * price + price;
    }

}
