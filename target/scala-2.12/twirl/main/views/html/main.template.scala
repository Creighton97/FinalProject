
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*9.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/styles.css")),format.raw/*10.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>

        <body id="index" data-spy="scroll" data-target=".navbar" data-offset="10">
        <nav class="navbar .navbar-inverse navbar-fixed-top">
                 <div class="container-fluid ">
                   <div class="navbar-header">
           <a class="navbar-brand" href=""""),_display_(/*23.43*/routes/*23.49*/.HomeController.index()),format.raw/*23.72*/(""""><span class="glyphicon glyphicon-fire"></span>Real Retail Reviews</a>
            </div>
              <ul class="nav navbar-nav navbar">
                
                <li><a href=""""),_display_(/*27.31*/routes/*27.37*/.HomeController.Mens()),format.raw/*27.59*/(""""><span class="glyphicon glyphicon-user"></span>Men's</a></li>
                <li><a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.Womens()),format.raw/*28.61*/(""""><span class="glyphicon glyphicon-user"></span>Women's</a></li>
                 
                <li><a href=""""),_display_(/*30.31*/routes/*30.37*/.HomeController.Kids()),format.raw/*30.59*/(""""><span class="glyphicon glyphicon-user"></span>Kids</a></li>
                <li><a href=""""),_display_(/*31.31*/routes/*31.37*/.HomeController.products()),format.raw/*31.63*/(""""><span class="glyphicon glyphicon-user"></span></a></li>
                
               </ul>
               <ul class="nav navbar-nav navbar-right">
              
               <li><a href=""""),_display_(/*36.30*/routes/*36.36*/.HomeController.AboutUs()),format.raw/*36.61*/(""""><span class="glyphicon glyphicon-info-sign"></span>
               </span> About Us</a></li>
                <li><a href=""""),_display_(/*38.31*/routes/*38.37*/.HomeController.contactUs()),format.raw/*38.64*/(""""><span class="glyphicon glyphicon-earphone"></span>Contact Us</a></li>
                </ul>
            </div>
          </div>
        </nav>
        """),_display_(/*43.10*/content),format.raw/*43.17*/("""
        """),format.raw/*44.9*/("""<script src=""""),_display_(/*44.23*/routes/*44.29*/.Assets.versioned("javascripts/main.js")),format.raw/*44.69*/("""" type="text/javascript"></script>
    </body>
</html>


"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 11:19:11 IST 2018
                  SOURCE: /home/wdd/FinalDay-master/app/views/main.scala.html
                  HASH: 4e5b864ffdd64883213132ae93be289986a43e7c
                  MATRIX: 952->1|1077->31|1105->33|1184->138|1219->147|1253->155|1278->160|1366->222|1380->228|1442->269|1524->325|1538->331|1601->373|1684->429|1699->435|1764->478|1852->539|1867->545|1928->584|2676->1305|2691->1311|2735->1334|2949->1521|2964->1527|3007->1549|3127->1642|3142->1648|3187->1672|3327->1785|3342->1791|3385->1813|3504->1905|3519->1911|3566->1937|3789->2133|3804->2139|3850->2164|4002->2289|4017->2295|4065->2322|4246->2476|4274->2483|4310->2492|4351->2506|4366->2512|4427->2552
                  LINES: 28->1|33->1|35->3|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|55->23|55->23|55->23|59->27|59->27|59->27|60->28|60->28|60->28|62->30|62->30|62->30|63->31|63->31|63->31|68->36|68->36|68->36|70->38|70->38|70->38|75->43|75->43|76->44|76->44|76->44|76->44
                  -- GENERATED --
              */
          