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

public final class head_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_head = getProperty("head");
out.write("\n");
out.write("\n");


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
addSubTemplate("head", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _global_headlibrenderer = null;
Object _global_headresources = null;
Object _global_analytics = null;
Object _dynamic_page = arguments.get("page");
Object _dynamic_inheritedpageproperties = bindings.get("inheritedpageproperties");
Object _dynamic_currentpage = bindings.get("currentpage");
Object _global_keywords = null;
Object _global_templatename = null;
Object _global_appresourcespath = null;
_global_headlibrenderer = renderContext.call("use", "headlibs.html", obj());
_global_headresources = renderContext.call("use", "head.resources.html", obj());
_global_analytics = renderContext.call("use", "analytics.html", obj());
out.write("\n    <meta charset=\"UTF-8\"/>\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0\"/>\n\n    ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_page, "robotsValue");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("\n        <meta name=\"robots\"");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_dynamic_page, "robotsValue");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
                {
                    Object var_shoulddisplayattr4 = ((renderContext.getObjectModel().toBoolean(var_attrcontent2) ? var_attrcontent2 : ("false".equals(var_attrvalue1))));
                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr4)) {
                        out.write(" content");
                        {
                            boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                            if (!var_istrueattr3) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\n    ");
    }
}
out.write("\n\n    ");
{
    Object var_testvariable5 = renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "canonical");
    if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
        out.write("\n        \n        <link rel=\"canonical\"");
        {
            Object var_attrvalue6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "canonical"), "uri");
            {
                Object var_shoulddisplayattr9 = ((renderContext.getObjectModel().toBoolean(var_attrvalue6) ? var_attrvalue6 : ("false".equals(var_attrvalue6))));
                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr9)) {
                    out.write(" href");
                    {
                        boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                        if (!var_istrueattr8) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrvalue6));
                            out.write("\"");
                        }
                    }
                }
            }
        }
        out.write("/>\n    ");
    }
}
out.write("\n\n    ");
{
    boolean var_testvariable10 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "canonical")));
    if (var_testvariable10) {
        out.write("\n        \n        <link rel=\"canonical\"");
        {
            Object var_attrvalue11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_page, "canonical"), "uri");
            {
                Object var_shoulddisplayattr14 = ((renderContext.getObjectModel().toBoolean(var_attrvalue11) ? var_attrvalue11 : ("false".equals(var_attrvalue11))));
                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr14)) {
                    out.write(" href");
                    {
                        boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                        if (!var_istrueattr13) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrvalue11));
                            out.write("\"");
                        }
                    }
                }
            }
        }
        out.write("/>\n    ");
    }
}
out.write("\n\n    <title>");
{
    Object var_15 = renderContext.call("xss", ((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "pageTitle")) ? renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "pageTitle") : renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title")))) ? ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "pageTitle")) ? renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "pageTitle") : renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title"))) : renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "name"))), "text");
    out.write(renderContext.getObjectModel().toString(var_15));
}
out.write("</title>\n\n    ");
{
    Object var_testvariable16 = renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "jcr:description");
    if (renderContext.getObjectModel().toBoolean(var_testvariable16)) {
        out.write("\n        <meta name=\"description\"");
        {
            Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "jcr:description");
            {
                Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
                {
                    Object var_shoulddisplayattr20 = ((renderContext.getObjectModel().toBoolean(var_attrcontent18) ? var_attrcontent18 : ("false".equals(var_attrvalue17))));
                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr20)) {
                        out.write(" content");
                        {
                            boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                            if (!var_istrueattr19) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\n    ");
    }
}
out.write("\n\n    ");
_global_keywords = renderContext.getObjectModel().resolveProperty(_dynamic_page, "keywords");
if (renderContext.getObjectModel().toBoolean(_global_keywords)) {
    out.write("<meta name=\"keywords\"");
    {
        Object var_attrvalue21 = _global_keywords;
        {
            Object var_attrcontent22 = renderContext.call("xss", var_attrvalue21, "attribute");
            {
                Object var_shoulddisplayattr24 = ((renderContext.getObjectModel().toBoolean(var_attrcontent22) ? var_attrcontent22 : ("false".equals(var_attrvalue21))));
                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr24)) {
                    out.write(" content");
                    {
                        boolean var_istrueattr23 = (var_attrvalue21.equals(true));
                        if (!var_istrueattr23) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent22));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write("/>");
}
out.write("\n    ");
_global_templatename = renderContext.getObjectModel().resolveProperty(_dynamic_page, "templateName");
if (renderContext.getObjectModel().toBoolean(_global_templatename)) {
    out.write("<meta name=\"template\"");
    {
        Object var_attrvalue25 = _global_templatename;
        {
            Object var_attrcontent26 = renderContext.call("xss", var_attrvalue25, "attribute");
            {
                Object var_shoulddisplayattr28 = ((renderContext.getObjectModel().toBoolean(var_attrcontent26) ? var_attrcontent26 : ("false".equals(var_attrvalue25))));
                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr28)) {
                    out.write(" content");
                    {
                        boolean var_istrueattr27 = (var_attrvalue25.equals(true));
                        if (!var_istrueattr27) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent26));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write("/>");
}
out.write("\n    <link href=\"https://fonts.googleapis.com/css?family=Muli:700,900&display=swap\" rel=\"stylesheet\"/>\n    <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700&display=swap\" rel=\"stylesheet\"/>\n\n    ");
{
    Object var_templatevar29 = renderContext.getObjectModel().resolveProperty(_global_analytics, "tealiumHead");
    {
        Object var_templateoptions30_field$_page = _dynamic_page;
        {
            java.util.Map var_templateoptions30 = obj().with("page", var_templateoptions30_field$_page);
            callUnit(out, renderContext, var_templatevar29, var_templateoptions30);
        }
    }
}
out.write("\n    ");
{
    Object var_testvariable31 = renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "genericHeadScript");
    if (renderContext.getObjectModel().toBoolean(var_testvariable31)) {
        {
            String var_32 = (("\n        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "genericHeadScript"), "unsafe"))) + "\n    ");
            out.write(renderContext.getObjectModel().toString(var_32));
        }
    }
}
out.write("\n\n    ");
{
    Object var_includedresult33 = renderContext.call("include", "customheaderlibs.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult33));
}
out.write("\n    ");
{
    Object var_templatevar35 = renderContext.getObjectModel().resolveProperty(_global_headlibrenderer, "headlibs");
    {
        Object var_templateoptions36_field$_clientlibcategories = renderContext.getObjectModel().resolveProperty(_dynamic_page, "clientLibCategories");
        {
            Object var_templateoptions36_field$_hascloudconfigsupport = renderContext.getObjectModel().resolveProperty(_dynamic_page, "hasCloudconfigSupport");
            {
                Object var_templateoptions36_field$_clientlibcategoriesjshead = renderContext.getObjectModel().resolveProperty(_dynamic_page, "clientLibCategoriesJsHead");
                {
                    Object var_templateoptions36_field$_pagemodel = _dynamic_page;
                    {
                        Object var_templateoptions36_field$_staticdesignpath = renderContext.getObjectModel().resolveProperty(_dynamic_page, "staticDesignPath");
                        {
                            Object var_templateoptions36_field$_designpath = renderContext.getObjectModel().resolveProperty(_dynamic_page, "designPath");
                            {
                                java.util.Map var_templateoptions36 = obj().with("clientLibCategories", var_templateoptions36_field$_clientlibcategories).with("hasCloudconfigSupport", var_templateoptions36_field$_hascloudconfigsupport).with("clientLibCategoriesJsHead", var_templateoptions36_field$_clientlibcategoriesjshead).with("pageModel", var_templateoptions36_field$_pagemodel).with("staticDesignPath", var_templateoptions36_field$_staticdesignpath).with("designPath", var_templateoptions36_field$_designpath);
                                callUnit(out, renderContext, var_templatevar35, var_templateoptions36);
                            }
                        }
                    }
                }
            }
        }
    }
}
out.write("\n\n    ");
_global_appresourcespath = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_inheritedpageproperties, "faviconFolderPath"), "uri");
if (renderContext.getObjectModel().toBoolean(_global_appresourcespath)) {
    {
        Object var_templatevar37 = renderContext.getObjectModel().resolveProperty(_global_headresources, "favicons");
        {
            Object var_templateoptions38_field$_iconpath = _global_appresourcespath;
            {
                java.util.Map var_templateoptions38 = obj().with("iconPath", var_templateoptions38_field$_iconpath);
                callUnit(out, renderContext, var_templatevar37, var_templateoptions38);
            }
        }
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

