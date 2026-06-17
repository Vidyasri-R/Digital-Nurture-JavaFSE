import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class ShoppingCartTest {
    private ShoppingCart cart;
    @Before
    public void setUp() {
        cart = new ShoppingCart();
        cart.addItem(29.99);
        cart.addItem(49.99);
    }
    @After
    public void tearDown() {
        cart.clear();
        cart = null;
    }
    @Test
    public void testAddItem() {
        // Arrange
        double newItemPrice = 19.99;
        // Act
        cart.addItem(newItemPrice);
        // Assert
        assertEquals(3, cart.getItemCount());
    }
    @Test
    public void testRemoveItem() {
        // Arrange
        double itemToRemove = 29.99;
        // Act
        cart.removeItem(itemToRemove);
        // Assert
        assertEquals(1, cart.getItemCount());
    }
    @Test
    public void testGetTotal() {
        // Arrange
        double expectedTotal = 79.98;
        // Act
        double actualTotal = cart.getTotal();
        // Assert
        assertEquals(expectedTotal, actualTotal, 0.01);
    }
    @Test
    public void testClearCart() {
        // Arrange - cart already has items from setUp
        // Act
        cart.clear();
        // Assert
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotal(), 0.01);
    }
}
