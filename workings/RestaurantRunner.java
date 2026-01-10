class RestaurantRunner {
    public static void main(String[] args) {
        Chef chef = new Chef("Manu");
        Restaurant restaurant = new Restaurant(chef);

        restaurant.displayRestaurant();
    }
}
