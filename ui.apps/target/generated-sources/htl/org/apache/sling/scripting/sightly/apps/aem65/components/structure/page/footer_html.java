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

public final class footer_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_footer = getProperty("footer");
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
addSubTemplate("footer", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _global_analytics = null;
Object _global_clientlib = null;
Object _dynamic_page = arguments.get("page");
Object _global_clientlibcategoriesjsbody = null;
_global_analytics = renderContext.call("use", "analytics.html", obj());
out.write("\n    ");
{
    Object var_includedresult0 = renderContext.call("include", "nickname.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult0));
}
out.write("\n    ");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
_global_clientlibcategoriesjsbody = renderContext.getObjectModel().resolveProperty(_dynamic_page, "clientLibCategoriesJsBody");
if (renderContext.getObjectModel().toBoolean(_global_clientlibcategoriesjsbody)) {
    {
        Object var_templatevar2 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "js");
        {
            Object var_templateoptions3_field$_categories = _global_clientlibcategoriesjsbody;
            {
                java.util.Map var_templateoptions3 = obj().with("categories", var_templateoptions3_field$_categories);
                callUnit(out, renderContext, var_templatevar2, var_templateoptions3);
            }
        }
    }
}
out.write("\n    ");
{
    Object var_includedresult4 = renderContext.call("include", "customfooterlibs.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult4));
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

