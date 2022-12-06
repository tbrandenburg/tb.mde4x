package tb.mde4x.rpy.utils;

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
  boolean shouldBeExported(IRPModelElement paramIRPModelElement);
  
  boolean shouldBeExported(IRPClassifier paramIRPClassifier);
  
  boolean shouldBeExported(IRPPackage paramIRPPackage);
  
  boolean shouldBeExported(IRPProject paramIRPProject);
  
  boolean shouldBeExported(IRPProfile paramIRPProfile);
  
  boolean shouldBeExported(IRPFlowItem paramIRPFlowItem);
  
  boolean shouldBeExported(IRPNode paramIRPNode);
  
  boolean shouldBeExported(IRPType paramIRPType);
  
  boolean shouldBeExported(IRPUseCase paramIRPUseCase);
  
  boolean shouldBeExported(IRPAssociationClass paramIRPAssociationClass);
  
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
