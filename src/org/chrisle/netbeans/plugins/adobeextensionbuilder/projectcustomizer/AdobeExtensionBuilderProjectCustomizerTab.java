package org.chrisle.netbeans.plugins.adobeextensionbuilder.projectcustomizer;

import java.awt.BorderLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.netbeans.spi.project.ui.support.ProjectCustomizer.Category;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;

/**
 *
 * @author ChrisLE
 */
public class AdobeExtensionBuilderProjectCustomizerTab implements ProjectCustomizer.CompositeCategoryProvider {

    private final String _name;

    private AdobeExtensionBuilderProjectCustomizerTab(String name) {
        this._name = name;
    }

    @Override
    public Category createCategory(Lookup lkp) {
        return ProjectCustomizer.Category.create(_name, _name, null);
    }

    @Override
    public JComponent createComponent(Category category, Lookup lkp) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(new JLabel(_name), BorderLayout.CENTER);
        return jPanel1;
    }

    @NbBundle.Messages({"LBL_Config=Rastermann"})
    @ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org-netbeans-modules-web-clientproject", position = 10)
//    @ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org-chrisle-netbeans-plugins-adobeextensionbuilder", position = 10)
    public static AdobeExtensionBuilderProjectCustomizerTab createMyDemoConfigurationTab() {
        return new AdobeExtensionBuilderProjectCustomizerTab(Bundle.LBL_Config());
    }
}