class Restaurant {
    public String restaurantChef;
    public Chef chef;

    public Restaurant(Chef chef) {
        this.restaurantChef = chef.chefName;
        this.chef = chef;
    }

    public void displayRestaurant() {
        chef.chefDetails();
    }
}
