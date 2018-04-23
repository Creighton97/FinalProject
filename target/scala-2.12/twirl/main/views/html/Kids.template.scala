
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

object Kids extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productList: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Kids")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/(""" 
      """),format.raw/*4.7*/("""<!-- https://getbootstrap.com/docs/4.0/layout/grid/ -->
      <div class="row">
            <div class="col-md-2">
    
              <!-- https://getbootstrap.com/docs/4.0/components/list-group/ -->
              <div class="list-group">
                <a href="#" class="list-group-item  list-group-item-action">All Categories</a>
              </div>
    
            </div>
    
            <div class="col-md-auto">
              <!-- https://getbootstrap.com/docs/4.0/content/tables/ -->
              <table class="table table-hover">
                <thead>
                  <th scope="col">ID</th>
                  <th scope="col">Name</th>
                  <th scope="col">Category</th>
                  <th scope="col">Description</th>
                  <th scope="col">Stock</th>
                  <th scope="col">Price</th>
                </thead>
                <tbody>
                """),format.raw/*27.86*/("""
                """),format.raw/*28.60*/("""
                """),_display_(/*29.18*/for(product <- productList) yield /*29.45*/ {_display_(Seq[Any](format.raw/*29.47*/("""
                  """),format.raw/*30.19*/("""<tr scope="row">
                    <td>"""),_display_(/*31.26*/product/*31.33*/.getId),format.raw/*31.39*/("""</td>
                    <td>"""),_display_(/*32.26*/product/*32.33*/.getName),format.raw/*32.41*/("""</td>
                    <td>"""),_display_(/*33.26*/product/*33.33*/.getCategory),format.raw/*33.45*/("""</td>
                    <td>"""),_display_(/*34.26*/product/*34.33*/.getDescription),format.raw/*34.48*/("""</td>
                    <td>"""),_display_(/*35.26*/product/*35.33*/.getStock),format.raw/*35.42*/("""</td>
                    <td class="text-right">&euro;"""),_display_(/*36.51*/("%.2f".format(product.getPrice))),format.raw/*36.84*/("""</td>
                  </tr>
                """)))}),format.raw/*38.18*/(""" """),format.raw/*38.36*/("""
                """),format.raw/*39.17*/("""</tbody>
                <tfoot>
                  <tr scope="row">
                    
                  </tr>
                </tfoot>
              </table>
              
              
    
            </div>
""")))}),format.raw/*50.2*/("""

"""))
      }
    }
  }

  def render(productList:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productList)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productList) => apply(productList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 11:19:11 IST 2018
                  SOURCE: /home/wdd/FinalDay-master/app/views/Kids.scala.html
                  HASH: b00d4bd548823719f517df3637234bd90a04aa20
                  MATRIX: 961->1|1091->36|1121->41|1141->53|1180->55|1215->64|2173->1063|2219->1124|2265->1143|2308->1170|2348->1172|2396->1192|2466->1235|2482->1242|2509->1248|2568->1280|2584->1287|2613->1295|2672->1327|2688->1334|2721->1346|2780->1378|2796->1385|2832->1400|2891->1432|2907->1439|2937->1448|3021->1505|3075->1538|3155->1587|3184->1605|3230->1623|3487->1850
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|59->27|60->28|61->29|61->29|61->29|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|70->38|70->38|71->39|82->50
                  -- GENERATED --
              */
          