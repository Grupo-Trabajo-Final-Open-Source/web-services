package com.git.sweetmanager.supply.domain.model.aggregates;

import com.git.sweetmanager.shared.domain.aggregates.AuditableAbstractAggregateRoot;
import com.git.sweetmanager.supply.domain.model.commands.CreateSupplyCommand;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "supplies")
public class Supply extends AuditableAbstractAggregateRoot<Supply> {
    // Attributes
    private String product;
    private Number quantity;
    private String address;
    private String expire;

    // Constructors
    public Supply(String product, Number quantity, String address, String expire) {
        this.product = product;
        this.quantity = quantity;
        this.address = address;
        this.expire = expire;
    }
    public Supply(CreateSupplyCommand command) {
        this.product = command.product();
        this.quantity = command.quantity();
        this.address = command.address();
        this.expire = command.expire();
    }

    // Methods
    public void updateProduct(String product) {
        this.product = product;
    }
    public void updateQuantity(Number quantity) {
        this.quantity = quantity;
    }
    public void updateAddress(String address) {
        this.address = address;
    }
    public void updateExpire(String expire) {
        this.expire = expire;
    }

    public String getProduct() {
        return product;
    }
    public Number getQuantity() {
        return quantity;
    }
    public String getAddress() {
        return address;
    }
    public String getExpire() {
        return expire;
    }
}