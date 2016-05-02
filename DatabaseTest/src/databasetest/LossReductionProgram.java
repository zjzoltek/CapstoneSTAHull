/**
 * LossReductionProgram: 
 * @author Lucas Hall
 * @version May 2, 2016
 */

package databasetest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "loss_reduction_program")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LossReductionProgram.findAll", query = "SELECT l FROM LossReductionProgram l"),
    @NamedQuery(name = "LossReductionProgram.findByPropertyID", query = "SELECT l FROM LossReductionProgram l WHERE l.lossReductionProgramPK.propertyID = :propertyID"),
    @NamedQuery(name = "LossReductionProgram.findByLRdt", query = "SELECT l FROM LossReductionProgram l WHERE l.lossReductionProgramPK.lRdt = :lRdt"),
    @NamedQuery(name = "LossReductionProgram.findByPFANumber", query = "SELECT l FROM LossReductionProgram l WHERE l.pFANumber = :pFANumber"),
    @NamedQuery(name = "LossReductionProgram.findByLRTOccupancy", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTOccupancy = :lRTOccupancy"),
    @NamedQuery(name = "LossReductionProgram.findByLRTComplaint", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTComplaint = :lRTComplaint"),
    @NamedQuery(name = "LossReductionProgram.findByLRTSemiAnnual", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTSemiAnnual = :lRTSemiAnnual"),
    @NamedQuery(name = "LossReductionProgram.findByLRTExplosive", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTExplosive = :lRTExplosive"),
    @NamedQuery(name = "LossReductionProgram.findByLRTAnnual", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTAnnual = :lRTAnnual"),
    @NamedQuery(name = "LossReductionProgram.findByLrtUst", query = "SELECT l FROM LossReductionProgram l WHERE l.lrtUst = :lrtUst"),
    @NamedQuery(name = "LossReductionProgram.findByLRTLifeSafety", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTLifeSafety = :lRTLifeSafety"),
    @NamedQuery(name = "LossReductionProgram.findByLRTPostIncident", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTPostIncident = :lRTPostIncident"),
    @NamedQuery(name = "LossReductionProgram.findByLRTSprinkler", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTSprinkler = :lRTSprinkler"),
    @NamedQuery(name = "LossReductionProgram.findByLRTOpenBurning", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTOpenBurning = :lRTOpenBurning"),
    @NamedQuery(name = "LossReductionProgram.findByLRTHazardousMaterialsPermit", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTHazardousMaterialsPermit = :lRTHazardousMaterialsPermit"),
    @NamedQuery(name = "LossReductionProgram.findByLRTOther", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTOther = :lRTOther"),
    @NamedQuery(name = "LossReductionProgram.findByLRTClass", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTClass = :lRTClass"),
    @NamedQuery(name = "LossReductionProgram.findByLRTBox", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTBox = :lRTBox"),
    @NamedQuery(name = "LossReductionProgram.findByLRTKnoxBox", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTKnoxBox = :lRTKnoxBox"),
    @NamedQuery(name = "LossReductionProgram.findByLRTKnoxBoxLocation", query = "SELECT l FROM LossReductionProgram l WHERE l.lRTKnoxBoxLocation = :lRTKnoxBoxLocation"),
    @NamedQuery(name = "LossReductionProgram.findByLRNNoCorrections", query = "SELECT l FROM LossReductionProgram l WHERE l.lRNNoCorrections = :lRNNoCorrections"),
    @NamedQuery(name = "LossReductionProgram.findByLRNAllCorrectionsDone", query = "SELECT l FROM LossReductionProgram l WHERE l.lRNAllCorrectionsDone = :lRNAllCorrectionsDone"),
    @NamedQuery(name = "LossReductionProgram.findByLRNLastInspection", query = "SELECT l FROM LossReductionProgram l WHERE l.lRNLastInspection = :lRNLastInspection"),
    @NamedQuery(name = "LossReductionProgram.findByLRNPreventionFollowUp", query = "SELECT l FROM LossReductionProgram l WHERE l.lRNPreventionFollowUp = :lRNPreventionFollowUp")})
public class LossReductionProgram implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LossReductionProgramPK lossReductionProgramPK;
    @Basic(optional = false)
    @Column(name = "PFA_Number")
    private int pFANumber;
    @Column(name = "LRT_Occupancy")
    private String lRTOccupancy;
    @Column(name = "LRT_Complaint")
    private String lRTComplaint;
    @Column(name = "LRT_SemiAnnual")
    private String lRTSemiAnnual;
    @Column(name = "LRT_Explosive")
    private String lRTExplosive;
    @Column(name = "LRT_Annual")
    private String lRTAnnual;
    @Column(name = "LRT_UST")
    private String lrtUst;
    @Column(name = "LRT_Life_Safety")
    private String lRTLifeSafety;
    @Column(name = "LRT_Post_Incident")
    private String lRTPostIncident;
    @Column(name = "LRT_Sprinkler")
    private String lRTSprinkler;
    @Column(name = "LRT_Open_Burning")
    private String lRTOpenBurning;
    @Column(name = "LRT_Hazardous_Materials_Permit")
    private String lRTHazardousMaterialsPermit;
    @Column(name = "LRT_Other")
    private String lRTOther;
    @Column(name = "LRT_Class")
    private String lRTClass;
    @Column(name = "LRT_Box")
    private String lRTBox;
    @Column(name = "LRT_Knox_Box")
    private String lRTKnoxBox;
    @Column(name = "LRT_Knox_Box_Location")
    private String lRTKnoxBoxLocation;
    @Column(name = "LRN_No_Corrections")
    private String lRNNoCorrections;
    @Column(name = "LRN_All_Corrections_Done")
    private String lRNAllCorrectionsDone;
    @Column(name = "LRN_Last_Inspection")
    @Temporal(TemporalType.DATE)
    private Date lRNLastInspection;
    @Basic(optional = false)
    @Column(name = "LRN_Prevention_Follow_Up")
    private String lRNPreventionFollowUp;
    @JoinColumn(name = "Property_ID", referencedColumnName = "Property_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Property property;
    @JoinColumn(name = "Inspector_FName", referencedColumnName = "First_Name")
    @ManyToOne(optional = false)
    private Inspector inspectorFName;
    @JoinColumn(name = "Inspector_LName", referencedColumnName = "Last_Name")
    @ManyToOne(optional = false)
    private Inspector inspectorLName;
    @JoinColumn(name = "Resp_Sign_FName", referencedColumnName = "First_Name")
    @ManyToOne(optional = false)
    private Signator respSignFName;
    @JoinColumn(name = "Resp_Sign_LName", referencedColumnName = "Last_Name")
    @ManyToOne(optional = false)
    private Signator respSignLName;
    @JoinColumn(name = "Inspection_Code", referencedColumnName = "Inspection_Code")
    @ManyToOne(optional = false)
    private InspectionCodes inspectionCode;

    public LossReductionProgram() {
    }

    public LossReductionProgram(LossReductionProgramPK lossReductionProgramPK) {
        this.lossReductionProgramPK = lossReductionProgramPK;
    }

    public LossReductionProgram(LossReductionProgramPK lossReductionProgramPK, int pFANumber, String lRNPreventionFollowUp) {
        this.lossReductionProgramPK = lossReductionProgramPK;
        this.pFANumber = pFANumber;
        this.lRNPreventionFollowUp = lRNPreventionFollowUp;
    }

    public LossReductionProgram(int propertyID, Date lRdt) {
        this.lossReductionProgramPK = new LossReductionProgramPK(propertyID, lRdt);
    }

    public LossReductionProgramPK getLossReductionProgramPK() {
        return lossReductionProgramPK;
    }

    public void setLossReductionProgramPK(LossReductionProgramPK lossReductionProgramPK) {
        this.lossReductionProgramPK = lossReductionProgramPK;
    }

    public int getPFANumber() {
        return pFANumber;
    }

    public void setPFANumber(int pFANumber) {
        this.pFANumber = pFANumber;
    }

    public String getLRTOccupancy() {
        return lRTOccupancy;
    }

    public void setLRTOccupancy(String lRTOccupancy) {
        this.lRTOccupancy = lRTOccupancy;
    }

    public String getLRTComplaint() {
        return lRTComplaint;
    }

    public void setLRTComplaint(String lRTComplaint) {
        this.lRTComplaint = lRTComplaint;
    }

    public String getLRTSemiAnnual() {
        return lRTSemiAnnual;
    }

    public void setLRTSemiAnnual(String lRTSemiAnnual) {
        this.lRTSemiAnnual = lRTSemiAnnual;
    }

    public String getLRTExplosive() {
        return lRTExplosive;
    }

    public void setLRTExplosive(String lRTExplosive) {
        this.lRTExplosive = lRTExplosive;
    }

    public String getLRTAnnual() {
        return lRTAnnual;
    }

    public void setLRTAnnual(String lRTAnnual) {
        this.lRTAnnual = lRTAnnual;
    }

    public String getLrtUst() {
        return lrtUst;
    }

    public void setLrtUst(String lrtUst) {
        this.lrtUst = lrtUst;
    }

    public String getLRTLifeSafety() {
        return lRTLifeSafety;
    }

    public void setLRTLifeSafety(String lRTLifeSafety) {
        this.lRTLifeSafety = lRTLifeSafety;
    }

    public String getLRTPostIncident() {
        return lRTPostIncident;
    }

    public void setLRTPostIncident(String lRTPostIncident) {
        this.lRTPostIncident = lRTPostIncident;
    }

    public String getLRTSprinkler() {
        return lRTSprinkler;
    }

    public void setLRTSprinkler(String lRTSprinkler) {
        this.lRTSprinkler = lRTSprinkler;
    }

    public String getLRTOpenBurning() {
        return lRTOpenBurning;
    }

    public void setLRTOpenBurning(String lRTOpenBurning) {
        this.lRTOpenBurning = lRTOpenBurning;
    }

    public String getLRTHazardousMaterialsPermit() {
        return lRTHazardousMaterialsPermit;
    }

    public void setLRTHazardousMaterialsPermit(String lRTHazardousMaterialsPermit) {
        this.lRTHazardousMaterialsPermit = lRTHazardousMaterialsPermit;
    }

    public String getLRTOther() {
        return lRTOther;
    }

    public void setLRTOther(String lRTOther) {
        this.lRTOther = lRTOther;
    }

    public String getLRTClass() {
        return lRTClass;
    }

    public void setLRTClass(String lRTClass) {
        this.lRTClass = lRTClass;
    }

    public String getLRTBox() {
        return lRTBox;
    }

    public void setLRTBox(String lRTBox) {
        this.lRTBox = lRTBox;
    }

    public String getLRTKnoxBox() {
        return lRTKnoxBox;
    }

    public void setLRTKnoxBox(String lRTKnoxBox) {
        this.lRTKnoxBox = lRTKnoxBox;
    }

    public String getLRTKnoxBoxLocation() {
        return lRTKnoxBoxLocation;
    }

    public void setLRTKnoxBoxLocation(String lRTKnoxBoxLocation) {
        this.lRTKnoxBoxLocation = lRTKnoxBoxLocation;
    }

    public String getLRNNoCorrections() {
        return lRNNoCorrections;
    }

    public void setLRNNoCorrections(String lRNNoCorrections) {
        this.lRNNoCorrections = lRNNoCorrections;
    }

    public String getLRNAllCorrectionsDone() {
        return lRNAllCorrectionsDone;
    }

    public void setLRNAllCorrectionsDone(String lRNAllCorrectionsDone) {
        this.lRNAllCorrectionsDone = lRNAllCorrectionsDone;
    }

    public Date getLRNLastInspection() {
        return lRNLastInspection;
    }

    public void setLRNLastInspection(Date lRNLastInspection) {
        this.lRNLastInspection = lRNLastInspection;
    }

    public String getLRNPreventionFollowUp() {
        return lRNPreventionFollowUp;
    }

    public void setLRNPreventionFollowUp(String lRNPreventionFollowUp) {
        this.lRNPreventionFollowUp = lRNPreventionFollowUp;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Inspector getInspectorFName() {
        return inspectorFName;
    }

    public void setInspectorFName(Inspector inspectorFName) {
        this.inspectorFName = inspectorFName;
    }

    public Inspector getInspectorLName() {
        return inspectorLName;
    }

    public void setInspectorLName(Inspector inspectorLName) {
        this.inspectorLName = inspectorLName;
    }

    public Signator getRespSignFName() {
        return respSignFName;
    }

    public void setRespSignFName(Signator respSignFName) {
        this.respSignFName = respSignFName;
    }

    public Signator getRespSignLName() {
        return respSignLName;
    }

    public void setRespSignLName(Signator respSignLName) {
        this.respSignLName = respSignLName;
    }

    public InspectionCodes getInspectionCode() {
        return inspectionCode;
    }

    public void setInspectionCode(InspectionCodes inspectionCode) {
        this.inspectionCode = inspectionCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lossReductionProgramPK != null ? lossReductionProgramPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LossReductionProgram)) {
            return false;
        }
        LossReductionProgram other = (LossReductionProgram) object;
        if ((this.lossReductionProgramPK == null && other.lossReductionProgramPK != null) || (this.lossReductionProgramPK != null && !this.lossReductionProgramPK.equals(other.lossReductionProgramPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databasetest.LossReductionProgram[ lossReductionProgramPK=" + lossReductionProgramPK + " ]";
    }

}
