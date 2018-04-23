
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Home")/*1.14*/ {_display_(Seq[Any](format.raw/*1.16*/("""
    
    """),format.raw/*3.5*/("""<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
  
    <!-- Wrapper for slides -->
      <div class="carousel-inner">
      <div class="item active">
        <img src="/assets/images/Addias.jpg" alt="Sale">
        <div class="carousel-caption">
         <h3>This months reviews</h3>
         <p>* The latest 5 sneakers reviews *</p>
      </div> 
      </div>
    
  
      <div class="item">
        <img src="/assets/images/Addias.jpg" alt="TV">
      </div>
      <div class="carousel-caption">
        <h3>This months  reviews</h3>
        <p>* The latest 5 sneakers reviews *</p>
     </div> 
  
      <div class="item">
        <img src="/assets/images/Addias.jpg" alt="iPhone">
      </div>
      <div class="carousel-caption">
        <h3>This months reviews</h3>
        <p>* The latest 5 sneakers reviews *</p>
     </div> 
    
    <div class="item">
        <img src="/assets/images/Addias.jpg" alt="Macbook">
      </div>
      <div class="carousel-caption">
        <h3>This months reviews</h3>
        <p>* The latest 5 sneakers reviews *</p>
     </div>
    
    
    </div>
  
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <style>
    .carousel-inner img """),format.raw/*61.25*/("""{"""),format.raw/*61.26*/("""
          
          """),format.raw/*63.11*/("""width: 60%; /* Set width to 100% */
          margin: auto;
        height:60%;
      """),format.raw/*66.7*/("""}"""),format.raw/*66.8*/("""
  """),format.raw/*67.3*/("""</style>
<div class="container">    
        <div class="row">
          <div class="col-sm-4">
<div class="panel panel-primary">
<div class="panel-heading">Mens</div>
 <div class="panel-body"><img src="/assets/images/MensShirt.jpg" style="width:100%" alt="Starwars2"></div>
              <div class="panel-footer">  </div>
  </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-danger">
              <div class="panel-heading">womens </div>
              <div class="panel-body"><img src="/assets/images/WomensSneakers.jpg" style="width:100%" alt="daddysHome2"></div>
              <div class="panel-footer"></div>
            </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-warning">
              <div class="panel-heading">Kids </div>
              <div class="panel-body"><img src="/assets/images/Wonder.jpg"class="img-responsive" style="width:100%" alt="Image"></div>
              <div class="panel-footer"> </div>
            </div>
          </div>
        </div>
      </div>
      <div class="container">    
        <div class="row">
          <div class="col-sm-4">
            <div class="panel panel-primary ">
              <div class="panel-heading"> Mens </div>
              <div class="panel-body"><img src="/assets/images/Paddington.jpg" class="img-responsive" style="width:100%" alt="Paddington2"></div>
              <div class="panel-footer"></div>
            </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-danger ">
              <div class="panel-heading">womens</div>
              <div class="panel-body"><img src="/assets/images/PitchPerfect3.jpg" class="img-responsive" style="width:100%" alt="PitchPerfect3"></div>
              <div class="panel-footer"> </div>
            </div>
          </div>
          <div class="col-sm-4"> 
            <div class="panel panel-warning">
              <div class="panel-heading">Kids </div>
              <div class="panel-body"><img src="/assets/images/JusticeLeague.jpg" class="img-responsive" style="width:100%" alt="JusticeLeague"></div>
              <div class="panel-footer"></div>
            </div>
          </div>
        </div>
      </div><br><br>     
""")))}),format.raw/*118.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 11:19:11 IST 2018
                  SOURCE: /home/wdd/FinalDay-master/app/views/index.scala.html
                  HASH: b19a4e6048f398014364fbb41b9d96d43d0b9305
                  MATRIX: 1030->1|1050->13|1089->15|1125->25|3048->1920|3077->1921|3127->1943|3240->2029|3268->2030|3298->2033|5604->4308
                  LINES: 33->1|33->1|33->1|35->3|93->61|93->61|95->63|98->66|98->66|99->67|150->118
                  -- GENERATED --
              */
          