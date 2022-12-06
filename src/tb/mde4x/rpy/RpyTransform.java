package tb.mde4x.rpy;

import java.util.HashMap;
import java.util.Map;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPProject;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

import tb.mde4x.rpy.Project;

import tb.mde4x.rpy.reader.RpyProjectReader;
import tb.mde4x.rpy.util.FullModelTransformPolicy;

public class RpyTransform {
    
    public static void main(String[] args) {
        IRPApplication app = null;
        IRPProject rpyPrj = null;
        Map<String,ModelElement> objectMap = new HashMap<String, ModelElement>();

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
                        
                        Project prj = RpyProjectReader.instance.create(rpyPrj, RpyFactory.eINSTANCE, objectMap, new FullModelTransformPolicy());
                        
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
