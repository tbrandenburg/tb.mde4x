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

public class FullModelTransformPolicy implements TransformPolicy {
  private boolean shouldExportPredefinedPackages = true;
  
  private boolean shouldExportAllTags = false;
  
  private boolean shouldExportDiagrams = true;
  
  private boolean shouldExportStatecharts = true;
  
  private boolean shouldExportFlowcharts = true;
  
  private boolean shouldExportFilenames = true;
  
  private boolean shouldExportGraphicalProperties = true;
  
  private boolean shouldExportUnresolvedElements = true;
  
  private boolean shouldExportDescriptionHTML = true;
  
  private boolean shouldExportDescriptionRTF = true;
  
  public void shouldExportAllTags(boolean bool) {
    this.shouldExportAllTags = bool;
  }
  
  public void shouldExportPredefinedPackages(boolean bool) {
    this.shouldExportPredefinedPackages = bool;
  }
  
  public void shouldExportDescriptionRTF(boolean bool) {
    this.shouldExportDescriptionRTF = bool;
  }
  
  public void shouldExportDescriptionHTML(boolean bool) {
    this.shouldExportDescriptionHTML = bool;
  }
  
  public void shouldExportUnresolvedElements(boolean bool) {
    this.shouldExportUnresolvedElements = bool;
  }
  
  public void shouldExportGraphicalProperties(boolean bool) {
    this.shouldExportGraphicalProperties = bool;
  }
  
  public void shouldExportFilenames(boolean bool) {
    this.shouldExportFilenames = bool;
  }
  
  public void shouldExportDiagrams(boolean bool) {
    this.shouldExportDiagrams = bool;
  }
  
  public void shouldExportStatecharts(boolean bool) {
    this.shouldExportStatecharts = bool;
  }
  
  public void shouldExportFlowcharts(boolean bool) {
    this.shouldExportFlowcharts = bool;
  }
  
  public boolean shouldBeExported(IRPModelElement rpObject) {
    return true;
  }
  
  public boolean shouldBeExported(IRPClassifier rpObject) {
    return true;
  }
  
  public boolean shouldBeExported(IRPPackage rpObject) {
    return true;
  }
  
  public boolean shouldBeExported(IRPProject rpObject) {
    return true;
  }
  
  public boolean shouldBeExported(IRPProfile rpObject) {
    return true;
  }
  
  public boolean shouldBeExported(IRPFlowItem element) {
    return true;
  }
  
  public boolean shouldBeExported(IRPNode element) {
    return true;
  }
  
  public boolean shouldBeExported(IRPType element) {
    return true;
  }
  
  public boolean shouldBeExported(IRPUseCase element) {
    return true;
  }
  
  public boolean shouldBeExported(IRPAssociationClass element) {
    return true;
  }
  
  public boolean shouldExportUnresolvedElements() {
    return this.shouldExportUnresolvedElements;
  }
  
  public boolean shouldExportAllTags() {
    return this.shouldExportAllTags;
  }
  
  public boolean shouldExportDiagrams() {
    return this.shouldExportDiagrams;
  }
  
  public boolean shouldExportStatecharts() {
    return this.shouldExportStatecharts;
  }
  
  public boolean shouldExportFlowcharts() {
    return this.shouldExportFlowcharts;
  }
  
  public boolean shouldExportFilenames() {
    return this.shouldExportFilenames;
  }
  
  public boolean shouldExportGraphicalProperties() {
    return this.shouldExportGraphicalProperties;
  }
  
  public boolean shouldExportPredefinedPackages() {
    return this.shouldExportPredefinedPackages;
  }
  
  public boolean shouldExportDescriptionHTML() {
    return this.shouldExportDescriptionHTML;
  }
  
  public boolean shouldExportDescriptionRTF() {
    return this.shouldExportDescriptionRTF;
  }
}
