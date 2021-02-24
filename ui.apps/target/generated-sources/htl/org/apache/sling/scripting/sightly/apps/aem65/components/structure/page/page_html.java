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

public final class page_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_head = null;
Object _global_footer = null;
Object _dynamic_page = bindings.get("page");
out.write("\n<!DOCTYPE HTML>\n");
_global_head = renderContext.call("use", "head.html", obj());
_global_footer = renderContext.call("use", "footer.html", obj());
out.write("<html>\n    <head>");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_head, "head");
    {
        Object var_templateoptions1_field$_page = _dynamic_page;
        {
            java.util.Map var_templateoptions1 = obj().with("page", var_templateoptions1_field$_page);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("</head>\n    <body>\n            ");
{
    Object var_includedresult2 = renderContext.call("include", "body.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult2));
}
out.write("\n            ");
{
    Object var_templatevar4 = renderContext.getObjectModel().resolveProperty(_global_footer, "footer");
    {
        Object var_templateoptions5_field$_page = _dynamic_page;
        {
            java.util.Map var_templateoptions5 = obj().with("page", var_templateoptions5_field$_page);
            callUnit(out, renderContext, var_templatevar4, var_templateoptions5);
        }
    }
}
out.write("\n        \n    </body>\n</html>\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

