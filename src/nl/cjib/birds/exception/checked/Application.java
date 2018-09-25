package nl.cjib.birds.exception.checked;

public class Application {

    public static void main(String[] args) throws IngException {

        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

                System.out.println(e.getMessage());


                // halve fixed
                throw new IngException("ing");

                // helemaal gefixed
            }
            if (i == 3) {
                Thread.currentThread().interrupt();
            }

            System.out.println(i);

        }

    }
}
