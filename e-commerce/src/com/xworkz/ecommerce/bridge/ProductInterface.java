package com.xworkz.ecommerce.bridge;

import com.xworkz.ecommerce.internal.*;

public interface ProductInterface {
    OrderData processOrder(OrderData orderData);
    ProductData getProduct(ProductData productData);
    CustomerData getCustomer(CustomerData customerData);
    ShippingData handleShipping(ShippingData shippingData);
    PaymentData processPayment(PaymentData paymentData);
}
