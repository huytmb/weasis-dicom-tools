package org.weasis.dicom.param;

import org.dcm4che3.data.Attributes;

@FunctionalInterface
public interface AttributeEditor {

    boolean apply(Attributes attributes, String tsuid, DicomNode sourceNode, DicomNode destinationNode);

}
