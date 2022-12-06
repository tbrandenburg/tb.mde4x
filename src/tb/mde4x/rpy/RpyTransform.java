package tb.mde4x.rpy;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPProject;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

import tb.mde4x.rpy.Project;

import tb.mde4x.rpy.reader.RpyProjectReader;

public class RpyTransform {
    
    public static void main(String[] args) {
        IRPApplication app = null;
        IRPProject rpyPrj = null;

        System.out.println("Waiting for Rhapsody...");

        // Wait for app
        while(app == null) {
            try {
                app = RhapsodyAppServer.getActiveRhapsodyApplication();

                System.out.println("Waiting for project...");
                
                // Wait for app
                while(rpyPrj == null) {
                    try {
                        rpyPrj = app.activeProject();
                        
                        RpyProjectReader prjReader = new RpyProjectReader();
                        Project prj = prjReader.transform(rpyPrj);
                        
                    } catch(Exception e) {
                        rpyPrj = null;
                    }
                }
            } catch(Exception e) {
                app = null;
            }
        }
    }

}
