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
@NbBundle.Messages({"LBL_Config=Adobe Extension Builder"})
@ProjectCustomizer.CompositeCategoryProvider.Registration(projectType = "org.netbeans.modules.web.clientproject", position = 900) // This works not
public class AdobeExtensionBuilderProjectCustomizerTab implements ProjectCustomizer.CompositeCategoryProvider {
    private final String _name;
    private final String _displayName;

    public AdobeExtensionBuilderProjectCustomizerTab() {
        this._displayName = Bundle.LBL_Config();
        this._name = "AdobeExtensionManager";
    }

    @Override
    public Category createCategory(Lookup lkp) {
        return ProjectCustomizer.Category.create(_name, _displayName, null);
    }

    @Override
    public JComponent createComponent(Category category, Lookup lkp) {
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(new JLabel(_displayName), BorderLayout.CENTER);
        return jPanel1;
    }
}