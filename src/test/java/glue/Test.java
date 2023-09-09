/*package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

    private ChromeDriver driver;
    private WebElement carrito;
    private  WebElement element1;
    private WebElement fixed;
    private WebElement testcomplet;
    private WebElement seleccion;


    @Given("El usuario quiera ingresar al carrito de compras")
    public void el_usuario_quiera_ingresar_al_carrito_de_compras() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ZIP-B205-E-009\\IdeaProjects\\parcial_maven\\src\\test\\java\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://smartbear.com/");
        driver.manage().window().maximize();

    }
    @When("Cuando este en el carrito agrgue el primer producto y agrege las espesificaciones del elemento")
    public void cuando_este_en_el_carrito_agrgue_el_primer_producto_y_agrege_las_espesificaciones_del_elemento() {

        carrito = driver.findElement(By.cssSelector(".fa-cart-plus"));
        carrito.click();
        element1 = driver.findElement(By.cssSelector(".prod-link-buy[href='/store/testcomplete/']"));
        element1.click();
        fixed = driver.findElement(By.xpath("//label[.='Fixed']"));
        fixed.click();
        testcomplet = driver.findElement(By.cssSelector("[for='platformBase']"));
        testcomplet.click();


    }
    @Then("Añada ele elemento al carrito")
    public void añada_ele_elemento_al_carrito() {
    seleccion = driver.findElement(By.cssSelector(".btn-preview-add-cart"));
        seleccion.click();

    }

}
*/