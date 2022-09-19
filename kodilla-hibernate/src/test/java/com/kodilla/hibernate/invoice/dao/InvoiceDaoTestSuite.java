package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Product");
        Product product2 = new Product("Product2");
        Item item = new Item(product,new BigDecimal("789"),67,new BigDecimal("456"));
        Item item2 = new Item(product2,new BigDecimal("790"),68,new BigDecimal("457"));
        item.getProducts().add(product);
        item2.getProducts().add(product2);
        product.setItem(item);
        product2.setItem(item2);
        Invoice invoice = new Invoice("765",new ArrayList<>());
        Invoice invoice2 = new Invoice("766",new ArrayList<>());
        invoice.getItems().add(item);
        invoice2.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice2);
        //When
        invoiceDao.save(invoice);
        invoiceDao.save(invoice2);
        int id = invoice.getId();
        int id2 = invoice2.getId();
        //Then
        assertNotEquals(0, id);
        assertNotEquals(0, id2);
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
