class Order {
    private int number;
    private Client client;

    public Order(int number, Client client) {
        this.number = number;
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public Client getClient() {
        return client;
    }
}

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

class Delivery {
    private Product product;
    private Order order;
    private String courier;

    public Delivery(Product product, Order order, String courier) {
        this.product = product;
        this.order = order;
        this.courier = courier;
    }

    public Product getProduct() {
        return product;
    }

    public Order getOrder() {
        return order;
    }

    public String getCourier() {
        return courier;
    }
}

class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван Иванов");
        Order order = new Order(123, client);
        Product product = new Product("iPhone 14", "Смартфоны", 999.99);
        Delivery delivery = new Delivery(product, order, "Петр Сидоров");

        System.out.println("Заказ №" + delivery.getOrder().getNumber() +
                " клиента " + delivery.getOrder().getClient().getName() +
                " содержит товар: " + delivery.getProduct().getName() +
                " (" + delivery.getProduct().getCategory() + ")" +
                " Доставка осуществляется курьером: " + delivery.getCourier());
    }
}