package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import models.Product;
// import model classes
import models.*;

// import views
import views.html.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
     
     
   // Declare a private FormFactory instance
   private FormFactory formFactory;

   // Inject an instance of FormFactory into the controller via its constructor
   @Inject
   public HomeController(FormFactory f) {
       this.formFactory = f;
   }  
    
     public Result index() {
        return ok(views.html.index.render());
    }

    public Result AboutUs() {
        return ok(views.html.AboutUs.render());
    }

    public Result Mens() {
        return ok(views.html.Mens.render());
    }

    public Result contactUs() {
        return ok(views.html.contactUs.render());
    }

    public Result Kids() {

        List<Product> productsList = Product.find.all();

        // Return the view, passing the product list as a parameter
        return ok(views.html.Kids.render(productsList));
    }

    public Result Womens() {
        return ok(views.html.Womens.render());
    }
    public Result products() {

        List<Product> productsList = Product.find.all();

        return ok(products.render(productsList));
    }
    public Result addProduct() {

        // Create a form by wrapping the Product class
        // in a FormFactory form instance
        Form<Product> productForm = formFactory.form(Product.class);
        
        return ok(addProduct.render(productForm));
    }
    public Result addProductSubmit() {

        // Retrieve the submitted form object (bind from the HTTP request)
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        // Check for errors (based on constraints set in the Product class)
        if (newProductForm.hasErrors()) {
            // Display the form again by returning a bad request
            return badRequest(addProduct.render(newProductForm));

        } else {
            // No errors found - extract the Product details from the form
            Product newProduct = newProductForm.get();

            // Save to the object to the Products table
            newProduct.save();

            // Set a success message in flash
            // for display in return view
            flash("success", "Product " + newProduct.getName() + " was added");

            // Redirect to the products page
            return redirect(controllers.routes.HomeController.index());
        }
    }
}

