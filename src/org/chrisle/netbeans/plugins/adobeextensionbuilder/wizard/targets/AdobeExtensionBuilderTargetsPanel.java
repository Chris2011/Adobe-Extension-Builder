package org.chrisle.netbeans.plugins.adobeextensionbuilder.wizard.targets;

import javax.swing.JPanel;
import org.openide.WizardDescriptor;
import org.openide.WizardValidationException;

/**
 *
 * @author ChrisLE
 */
class AdobeExtensionBuilderTargetsPanel extends JPanel {

    public AdobeExtensionBuilderTargetsPanel(AdobeExtensionBuilderTargetsWizardPanel aThis) {
    }
    
    boolean valid(WizardDescriptor wizardDescriptor) {

//        if (projectNameTextField.getText().length() == 0) {
//            // TODO if using org.openide.dialogs >= 7.8, can use WizardDescriptor.PROP_ERROR_MESSAGE:
//            wizardDescriptor.putProperty("WizardPanel_errorMessage",
//                    "Project Name is not a valid folder name.");
//            return false; // Display name not specified
//        }
//        File f = FileUtil.normalizeFile(new File(projectLocationTextField.getText()).getAbsoluteFile());
//        if (!f.isDirectory()) {
//            String message = "Project Folder is not a valid path.";
//            wizardDescriptor.putProperty("WizardPanel_errorMessage", message);
//            return false;
//        }
//        final File destFolder = FileUtil.normalizeFile(new File(createdFolderTextField.getText()).getAbsoluteFile());
//
//        File projLoc = destFolder;
//        while (projLoc != null && !projLoc.exists()) {
//            projLoc = projLoc.getParentFile();
//        }
//        if (projLoc == null || !projLoc.canWrite()) {
//            wizardDescriptor.putProperty("WizardPanel_errorMessage",
//                    "Project Folder cannot be created.");
//            return false;
//        }
//
//        if (FileUtil.toFileObject(projLoc) == null) {
//            String message = "Project Folder is not a valid path.";
//            wizardDescriptor.putProperty("WizardPanel_errorMessage", message);
//            return false;
//        }
//
//        File[] kids = destFolder.listFiles();
//        if (destFolder.exists() && kids != null && kids.length > 0) {
//            // Folder exists and is not empty
//            wizardDescriptor.putProperty("WizardPanel_errorMessage",
//                    "Project Folder already exists and is not empty.");
//            return false;
//        }
//        wizardDescriptor.putProperty("WizardPanel_errorMessage", "");
        return true;
    }
    
    void store(WizardDescriptor d) {
//        String name = projectNameTextField.getText().trim();
//        String folder = createdFolderTextField.getText().trim();
//
//        d.putProperty("projdir", new File(folder));
//        d.putProperty("name", name);
    }

    void read(WizardDescriptor settings) {
//        File projectLocation = (File) settings.getProperty("projdir");
//        if (projectLocation == null || projectLocation.getParentFile() == null || !projectLocation.getParentFile().isDirectory()) {
//            projectLocation = ProjectChooser.getProjectsFolder();
//        } else {
//            projectLocation = projectLocation.getParentFile();
//        }
//        this.projectLocationTextField.setText(projectLocation.getAbsolutePath());
//
//        String projectName = (String) settings.getProperty("name");
//        if (projectName == null) {
//            projectName = "AdobeExtensionBuilder";
//        }
//        this.projectNameTextField.setText(projectName);
//        this.projectNameTextField.selectAll();
    }
    
    void validate(WizardDescriptor d) throws WizardValidationException {
        // nothing to validate
    }
    
}
