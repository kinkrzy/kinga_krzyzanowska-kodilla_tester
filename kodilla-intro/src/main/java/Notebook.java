public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This notebook is very cheap");
        } else {
            if (this.price > 1000) {
                System.out.println("This notebook is expensive.");
            } else {
                if (this.price <= 1000 && this.price > 600)
                    System.out.println("The price is good.");
            }
        }
    }

    public void checkYear() {
        if (this.year < 2006) {
            System.out.println("This notebook is very old");
        } else {
            if (this.year < 2019) {
                System.out.println("This notebook not too old.");
            } else {
                if (this.year > 2019)
                    System.out.println("This notebook is quite new.");
            }
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is very light");
            if (this.weight > 600 & this.weight < 2000)
                System.out.println("This notebook is not too heavy");
            } else {
                if (this.weight >= 2000)
                    System.out.println("This notebook is heavy");
            }
        }
    }
