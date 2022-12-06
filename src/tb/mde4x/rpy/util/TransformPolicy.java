package tb.mde4x.rpy.util;

import com.telelogic.rhapsody.core.IRPAssociationClass;
import com.telelogic.rhapsody.core.IRPClassifier;
import com.telelogic.rhapsody.core.IRPFlowItem;
import com.telelogic.rhapsody.core.IRPModelElement;
import com.telelogic.rhapsody.core.IRPNode;
import com.telelogic.rhapsody.core.IRPPackage;
import com.telelogic.rhapsody.core.IRPProfile;
import com.telelogic.rhapsody.core.IRPProject;
import com.telelogic.rhapsody.core.IRPType;
import com.telelogic.rhapsody.core.IRPUseCase;

public interface TransformPolicy {
  boolean shouldBeExported(Object obj);
	  
  boolean shouldBeExported(IRPModelElement irpModelElement);
  
  boolean shouldBeExported(IRPClassifier irpClassifier);
  
  boolean shouldBeExported(IRPPackage irpPackage);
  
  boolean shouldBeExported(IRPProject irpProject);
  
  boolean shouldBeExported(IRPProfile irpProfile);
  
  boolean shouldBeExported(IRPFlowItem irpFlowItem);
  
  boolean shouldBeExported(IRPNode irpNode);
  
  boolean shouldBeExported(IRPType irpType);
  
  boolean shouldBeExported(IRPUseCase irpUseCase);
  
  boolean shouldBeExported(IRPAssociationClass irpAssociationClass);
  
  boolean shouldExportAllTags();
  
  boolean shouldExportDiagrams();
  
  boolean shouldExportStatecharts();
  
  boolean shouldExportFlowcharts();
  
  boolean shouldExportFilenames();
  
  boolean shouldExportGraphicalProperties();
  
  boolean shouldExportUnresolvedElements();
  
  boolean shouldExportPredefinedPackages();
  
  boolean shouldExportDescriptionHTML();
  
  boolean shouldExportDescriptionRTF();
}
