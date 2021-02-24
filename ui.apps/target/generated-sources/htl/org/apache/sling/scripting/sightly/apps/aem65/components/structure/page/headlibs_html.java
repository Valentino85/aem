/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.aem65.components.structure.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class headlibs_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_headlibs = getProperty("headlibs");
out.write("\n");
out.write("\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------

/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
addSubTemplate("headlibs", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _global_clientlib = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _dynamic_hascloudconfigsupport = arguments.get("hascloudconfigsupport");
Object _dynamic_clientlibcategoriesjshead = arguments.get("clientlibcategoriesjshead");
Object _dynamic_inheritedpageproperties = bindings.get("inheritedpageproperties");
Object _dynamic_pagemodel = arguments.get("pagemodel");
Object _dynamic_clientlibcategories = arguments.get("clientlibcategories");
Object _dynamic_staticdesignpath = arguments.get("staticdesignpath");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
out.write("\n    ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "disabled")));
    if (var_testvariable0) {
        {
            Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
            {
                Object var_templateoptions2_field$_categories = (new Object[] {"cq.pagetypes.html5page", "cq.authoring.page", "cq.wcm.foundation-main", "cq.shared"});
                {
                    java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
                    callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
                }
            }
        }
    }
}
out.write("\n    ");
{
    Object var_includedresult3 = renderContext.call("include", "/libs/cq/cloudserviceconfigs/components/servicelibs/servicelibs.jsp", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult3));
}
out.write("\n    ");
{
    Object var_testvariable5 = _dynamic_hascloudconfigsupport;
    if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
        {
            Object var_resourcecontent6 = renderContext.call("includeResource", "cloudconfig-header", obj().with("resourceType", "cq/cloudconfig/components/scripttags/header"));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent6));
        }
    }
}
out.write("\n    ");
{
    Object var_testvariable7 = _dynamic_clientlibcategoriesjshead;
    if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
        {
            Object var_templatevar8 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "js");
            {
                Object var_templateoptions9_field$_categories = _dynamic_clientlibcategoriesjshead;
                {
                    java.util.Map var_templateoptions9 = obj().with("categories", var_templateoptions9_field$_categories);
                    callUnit(out, renderContext, var_templatevar8, var_templateoptions9);
                }
            }
        }
    }
}
out.write("\n    ");
{
    Object var_testvariable10 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "playtechiapi")) ? renderContext.getObjectModel().resolveProperty(_dynamic_pagemodel, "usePlaytechScript") : renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "playtechiapi")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable10)) {
        out.write("<script");
        {
            Object var_attrvalue11 = renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "playtechiapi");
            {
                Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "uri");
                {
                    Object var_shoulddisplayattr14 = ((renderContext.getObjectModel().toBoolean(var_attrcontent12) ? var_attrcontent12 : ("false".equals(var_attrvalue11))));
                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr14)) {
                        out.write(" src");
                        {
                            boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                            if (!var_istrueattr13) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" async defer></script>");
    }
}
out.write("\n    ");
{
    Object var_testvariable15 = _dynamic_clientlibcategories;
    if (renderContext.getObjectModel().toBoolean(var_testvariable15)) {
        {
            Object var_templatevar16 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
            {
                Object var_templateoptions17_field$_categories = _dynamic_clientlibcategories;
                {
                    java.util.Map var_templateoptions17 = obj().with("categories", var_templateoptions17_field$_categories);
                    callUnit(out, renderContext, var_templatevar16, var_templateoptions17);
                }
            }
        }
    }
}
out.write("\n    ");
{
    Object var_testvariable18 = _dynamic_staticdesignpath;
    if (renderContext.getObjectModel().toBoolean(var_testvariable18)) {
        out.write("<link");
        {
            Object var_attrvalue19 = _dynamic_staticdesignpath;
            {
                Object var_attrcontent20 = renderContext.call("xss", var_attrvalue19, "uri");
                {
                    Object var_shoulddisplayattr22 = ((renderContext.getObjectModel().toBoolean(var_attrcontent20) ? var_attrcontent20 : ("false".equals(var_attrvalue19))));
                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr22)) {
                        out.write(" href");
                        {
                            boolean var_istrueattr21 = (var_attrvalue19.equals(true));
                            if (!var_istrueattr21) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent20));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" rel=\"stylesheet\" type=\"text/css\"/>");
    }
}
out.write("\n");


// End Of Main Sub-Template Body ------------------------------------------------------------------
    }



    {
//Sub-Sub-Templates Initialization ----------------------------------------------------------------



//End of Sub-Sub-Templates Initialization ---------------------------------------------------------
    }
    
});


//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

