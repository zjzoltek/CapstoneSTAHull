/**
 * InspectionReport: 
 * @author Lucas Hall
 * @version May 6, 2016
 */

package capstonelh.database;

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
@Table(name = "inspection_report")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InspectionReport.findAll", query = "SELECT i FROM InspectionReport i"),
    @NamedQuery(name = "InspectionReport.findByPropertyID", query = "SELECT i FROM InspectionReport i WHERE i.inspectionReportPK.propertyID = :propertyID"),
    @NamedQuery(name = "InspectionReport.findByInspDt", query = "SELECT i FROM InspectionReport i WHERE i.inspectionReportPK.inspDt = :inspDt"),
    @NamedQuery(name = "InspectionReport.findByPFANumber", query = "SELECT i FROM InspectionReport i WHERE i.pFANumber = :pFANumber"),
    @NamedQuery(name = "InspectionReport.findByHazardClass", query = "SELECT i FROM InspectionReport i WHERE i.hazardClass = :hazardClass"),
    @NamedQuery(name = "InspectionReport.findByPanelFire", query = "SELECT i FROM InspectionReport i WHERE i.panelFire = :panelFire"),
    @NamedQuery(name = "InspectionReport.findByPanelActive", query = "SELECT i FROM InspectionReport i WHERE i.panelActive = :panelActive"),
    @NamedQuery(name = "InspectionReport.findByPanelLocation", query = "SELECT i FROM InspectionReport i WHERE i.panelLocation = :panelLocation"),
    @NamedQuery(name = "InspectionReport.findByPanelNormal", query = "SELECT i FROM InspectionReport i WHERE i.panelNormal = :panelNormal"),
    @NamedQuery(name = "InspectionReport.findByINCorrected", query = "SELECT i FROM InspectionReport i WHERE i.iNCorrected = :iNCorrected"),
    @NamedQuery(name = "InspectionReport.findByINViolations", query = "SELECT i FROM InspectionReport i WHERE i.iNViolations = :iNViolations"),
    @NamedQuery(name = "InspectionReport.findByComments", query = "SELECT i FROM InspectionReport i WHERE i.comments = :comments"),
    @NamedQuery(name = "InspectionReport.findByEDoorObstructions", query = "SELECT i FROM InspectionReport i WHERE i.eDoorObstructions = :eDoorObstructions"),
    @NamedQuery(name = "InspectionReport.findByEDoorLocksPanicHardware", query = "SELECT i FROM InspectionReport i WHERE i.eDoorLocksPanicHardware = :eDoorLocksPanicHardware"),
    @NamedQuery(name = "InspectionReport.findByESignExitSigns", query = "SELECT i FROM InspectionReport i WHERE i.eSignExitSigns = :eSignExitSigns"),
    @NamedQuery(name = "InspectionReport.findByESignEmergencyLights", query = "SELECT i FROM InspectionReport i WHERE i.eSignEmergencyLights = :eSignEmergencyLights"),
    @NamedQuery(name = "InspectionReport.findByFDoorFireDoorsMaintainedorclosedfully", query = "SELECT i FROM InspectionReport i WHERE i.fDoorFireDoorsMaintainedorclosedfully = :fDoorFireDoorsMaintainedorclosedfully"),
    @NamedQuery(name = "InspectionReport.findByFDoorUnapprovedOpenDevices", query = "SELECT i FROM InspectionReport i WHERE i.fDoorUnapprovedOpenDevices = :fDoorUnapprovedOpenDevices"),
    @NamedQuery(name = "InspectionReport.findByFDoorClearObstructions", query = "SELECT i FROM InspectionReport i WHERE i.fDoorClearObstructions = :fDoorClearObstructions"),
    @NamedQuery(name = "InspectionReport.findByExtinguishersMinimum2AIOBC", query = "SELECT i FROM InspectionReport i WHERE i.extinguishersMinimum2AIOBC = :extinguishersMinimum2AIOBC"),
    @NamedQuery(name = "InspectionReport.findByExtinguishersMax75ftTravel", query = "SELECT i FROM InspectionReport i WHERE i.extinguishersMax75ftTravel = :extinguishersMax75ftTravel"),
    @NamedQuery(name = "InspectionReport.findByExtinguishersAnnualInspection", query = "SELECT i FROM InspectionReport i WHERE i.extinguishersAnnualInspection = :extinguishersAnnualInspection"),
    @NamedQuery(name = "InspectionReport.findByExtinguisersAccess", query = "SELECT i FROM InspectionReport i WHERE i.extinguisersAccess = :extinguisersAccess"),
    @NamedQuery(name = "InspectionReport.findByElectricExtensionCords", query = "SELECT i FROM InspectionReport i WHERE i.electricExtensionCords = :electricExtensionCords"),
    @NamedQuery(name = "InspectionReport.findByElectricMultiPlugAdapters", query = "SELECT i FROM InspectionReport i WHERE i.electricMultiPlugAdapters = :electricMultiPlugAdapters"),
    @NamedQuery(name = "InspectionReport.findByElectricOpenBoxesSwitches", query = "SELECT i FROM InspectionReport i WHERE i.electricOpenBoxesSwitches = :electricOpenBoxesSwitches"),
    @NamedQuery(name = "InspectionReport.findByElectricOpeningsElectricalPanel", query = "SELECT i FROM InspectionReport i WHERE i.electricOpeningsElectricalPanel = :electricOpeningsElectricalPanel"),
    @NamedQuery(name = "InspectionReport.findByElectric36inClearanceStorage", query = "SELECT i FROM InspectionReport i WHERE i.electric36inClearanceStorage = :electric36inClearanceStorage"),
    @NamedQuery(name = "InspectionReport.findByStorageHousekeeping", query = "SELECT i FROM InspectionReport i WHERE i.storageHousekeeping = :storageHousekeeping"),
    @NamedQuery(name = "InspectionReport.findByStorage24inBelowCeiling", query = "SELECT i FROM InspectionReport i WHERE i.storage24inBelowCeiling = :storage24inBelowCeiling"),
    @NamedQuery(name = "InspectionReport.findByStorage18inbelowsprinklers", query = "SELECT i FROM InspectionReport i WHERE i.storage18inbelowsprinklers = :storage18inbelowsprinklers"),
    @NamedQuery(name = "InspectionReport.findByStorageUnderStairs", query = "SELECT i FROM InspectionReport i WHERE i.storageUnderStairs = :storageUnderStairs"),
    @NamedQuery(name = "InspectionReport.findByStorageCloseIgnitionSource", query = "SELECT i FROM InspectionReport i WHERE i.storageCloseIgnitionSource = :storageCloseIgnitionSource"),
    @NamedQuery(name = "InspectionReport.findByFlammable704placards", query = "SELECT i FROM InspectionReport i WHERE i.flammable704placards = :flammable704placards"),
    @NamedQuery(name = "InspectionReport.findByFlammableMSDS", query = "SELECT i FROM InspectionReport i WHERE i.flammableMSDS = :flammableMSDS"),
    @NamedQuery(name = "InspectionReport.findByFlammableNonSmokingSigns", query = "SELECT i FROM InspectionReport i WHERE i.flammableNonSmokingSigns = :flammableNonSmokingSigns"),
    @NamedQuery(name = "InspectionReport.findByGassesCompressedSecured", query = "SELECT i FROM InspectionReport i WHERE i.gassesCompressedSecured = :gassesCompressedSecured"),
    @NamedQuery(name = "InspectionReport.findByFinish4A403CFireExtinguisherwithin30ft", query = "SELECT i FROM InspectionReport i WHERE i.finish4A403CFireExtinguisherwithin30ft = :finish4A403CFireExtinguisherwithin30ft"),
    @NamedQuery(name = "InspectionReport.findByFinishApprovedSpraybooth", query = "SELECT i FROM InspectionReport i WHERE i.finishApprovedSpraybooth = :finishApprovedSpraybooth"),
    @NamedQuery(name = "InspectionReport.findByFinishAutoExtinguishingInspectedAnnually", query = "SELECT i FROM InspectionReport i WHERE i.finishAutoExtinguishingInspectedAnnually = :finishAutoExtinguishingInspectedAnnually"),
    @NamedQuery(name = "InspectionReport.findByFinishWarningSmokingSigns", query = "SELECT i FROM InspectionReport i WHERE i.finishWarningSmokingSigns = :finishWarningSmokingSigns"),
    @NamedQuery(name = "InspectionReport.findBySprinklersAnnualService", query = "SELECT i FROM InspectionReport i WHERE i.sprinklersAnnualService = :sprinklersAnnualService"),
    @NamedQuery(name = "InspectionReport.findBySprinklersDateService", query = "SELECT i FROM InspectionReport i WHERE i.sprinklersDateService = :sprinklersDateService"),
    @NamedQuery(name = "InspectionReport.findBySprinklersAccess", query = "SELECT i FROM InspectionReport i WHERE i.sprinklersAccess = :sprinklersAccess"),
    @NamedQuery(name = "InspectionReport.findBySprinklersStandpipeStickeronDoor", query = "SELECT i FROM InspectionReport i WHERE i.sprinklersStandpipeStickeronDoor = :sprinklersStandpipeStickeronDoor"),
    @NamedQuery(name = "InspectionReport.findBySprinklersSprinklerRoomIdentified", query = "SELECT i FROM InspectionReport i WHERE i.sprinklersSprinklerRoomIdentified = :sprinklersSprinklerRoomIdentified"),
    @NamedQuery(name = "InspectionReport.findBySprinklersRiserLocation", query = "SELECT i FROM InspectionReport i WHERE i.sprinklersRiserLocation = :sprinklersRiserLocation"),
    @NamedQuery(name = "InspectionReport.findByHESServiceWithin6Months", query = "SELECT i FROM InspectionReport i WHERE i.hESServiceWithin6Months = :hESServiceWithin6Months"),
    @NamedQuery(name = "InspectionReport.findByHESLastServiceDate", query = "SELECT i FROM InspectionReport i WHERE i.hESLastServiceDate = :hESLastServiceDate"),
    @NamedQuery(name = "InspectionReport.findByHESAccessRemotePull", query = "SELECT i FROM InspectionReport i WHERE i.hESAccessRemotePull = :hESAccessRemotePull"),
    @NamedQuery(name = "InspectionReport.findByHESClean", query = "SELECT i FROM InspectionReport i WHERE i.hESClean = :hESClean"),
    @NamedQuery(name = "InspectionReport.findByHESKClassExtinguisher", query = "SELECT i FROM InspectionReport i WHERE i.hESKClassExtinguisher = :hESKClassExtinguisher"),
    @NamedQuery(name = "InspectionReport.findByHESNozzleCondition", query = "SELECT i FROM InspectionReport i WHERE i.hESNozzleCondition = :hESNozzleCondition"),
    @NamedQuery(name = "InspectionReport.findByHESFiltersPlace", query = "SELECT i FROM InspectionReport i WHERE i.hESFiltersPlace = :hESFiltersPlace"),
    @NamedQuery(name = "InspectionReport.findByOccupationLoad", query = "SELECT i FROM InspectionReport i WHERE i.occupationLoad = :occupationLoad"),
    @NamedQuery(name = "InspectionReport.findByAddressVisibleLegible", query = "SELECT i FROM InspectionReport i WHERE i.addressVisibleLegible = :addressVisibleLegible"),
    @NamedQuery(name = "InspectionReport.findByFDAMaitLubrication", query = "SELECT i FROM InspectionReport i WHERE i.fDAMaitLubrication = :fDAMaitLubrication"),
    @NamedQuery(name = "InspectionReport.findByFDAKnoxBoxKeysCurrent", query = "SELECT i FROM InspectionReport i WHERE i.fDAKnoxBoxKeysCurrent = :fDAKnoxBoxKeysCurrent"),
    @NamedQuery(name = "InspectionReport.findByFDAKnoxBoxLocation", query = "SELECT i FROM InspectionReport i WHERE i.fDAKnoxBoxLocation = :fDAKnoxBoxLocation"),
    @NamedQuery(name = "InspectionReport.findByFDCPlace", query = "SELECT i FROM InspectionReport i WHERE i.fDCPlace = :fDCPlace"),
    @NamedQuery(name = "InspectionReport.findByFDCIdentified", query = "SELECT i FROM InspectionReport i WHERE i.fDCIdentified = :fDCIdentified"),
    @NamedQuery(name = "InspectionReport.findByFDCAccessUnobstructed", query = "SELECT i FROM InspectionReport i WHERE i.fDCAccessUnobstructed = :fDCAccessUnobstructed"),
    @NamedQuery(name = "InspectionReport.findByFDCLocation", query = "SELECT i FROM InspectionReport i WHERE i.fDCLocation = :fDCLocation"),
    @NamedQuery(name = "InspectionReport.findByElevatorkeys", query = "SELECT i FROM InspectionReport i WHERE i.elevatorkeys = :elevatorkeys"),
    @NamedQuery(name = "InspectionReport.findByPropanePlacards", query = "SELECT i FROM InspectionReport i WHERE i.propanePlacards = :propanePlacards"),
    @NamedQuery(name = "InspectionReport.findByPropanePermit", query = "SELECT i FROM InspectionReport i WHERE i.propanePermit = :propanePermit"),
    @NamedQuery(name = "InspectionReport.findByPropaneImpactBollards", query = "SELECT i FROM InspectionReport i WHERE i.propaneImpactBollards = :propaneImpactBollards"),
    @NamedQuery(name = "InspectionReport.findByOtherViolations", query = "SELECT i FROM InspectionReport i WHERE i.otherViolations = :otherViolations")})
public class InspectionReport implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InspectionReportPK inspectionReportPK;
    @Basic(optional = false)
    @Column(name = "PFA_Number")
    private int pFANumber;
    @Column(name = "Hazard_Class")
    private String hazardClass;
    @Basic(optional = false)
    @Column(name = "Panel_Fire")
    private String panelFire;
    @Column(name = "Panel_Active")
    private String panelActive;
    @Column(name = "Panel_Location")
    private String panelLocation;
    @Column(name = "Panel_Normal")
    private String panelNormal;
    @Column(name = "IN_Corrected")
    private String iNCorrected;
    @Column(name = "IN_Violations")
    private String iNViolations;
    @Basic(optional = false)
    @Column(name = "Comments")
    private String comments;
    @Basic(optional = false)
    @Column(name = "EDoor_Obstructions")
    private String eDoorObstructions;
    @Basic(optional = false)
    @Column(name = "EDoor_Locks_Panic_Hardware")
    private String eDoorLocksPanicHardware;
    @Basic(optional = false)
    @Column(name = "ESign_Exit_Signs")
    private String eSignExitSigns;
    @Basic(optional = false)
    @Column(name = "ESign_Emergency_Lights")
    private String eSignEmergencyLights;
    @Basic(optional = false)
    @Column(name = "FDoor_Fire_Doors_Maintained_or_closed_fully")
    private String fDoorFireDoorsMaintainedorclosedfully;
    @Basic(optional = false)
    @Column(name = "FDoor_Unapproved_Open_Devices")
    private String fDoorUnapprovedOpenDevices;
    @Basic(optional = false)
    @Column(name = "FDoor_Clear_Obstructions")
    private String fDoorClearObstructions;
    @Basic(optional = false)
    @Column(name = "Extinguishers_Minimum_2AIOBC")
    private String extinguishersMinimum2AIOBC;
    @Basic(optional = false)
    @Column(name = "Extinguishers_Max_75ft_Travel")
    private String extinguishersMax75ftTravel;
    @Basic(optional = false)
    @Column(name = "Extinguishers_Annual_Inspection")
    private String extinguishersAnnualInspection;
    @Basic(optional = false)
    @Column(name = "Extinguisers_Access")
    private String extinguisersAccess;
    @Basic(optional = false)
    @Column(name = "Electric_Extension_Cords")
    private String electricExtensionCords;
    @Basic(optional = false)
    @Column(name = "Electric_Multi_Plug_Adapters")
    private String electricMultiPlugAdapters;
    @Basic(optional = false)
    @Column(name = "Electric_Open_Boxes_Switches")
    private String electricOpenBoxesSwitches;
    @Basic(optional = false)
    @Column(name = "Electric_Openings_Electrical_Panel")
    private String electricOpeningsElectricalPanel;
    @Basic(optional = false)
    @Column(name = "Electric_36in_Clearance_Storage")
    private String electric36inClearanceStorage;
    @Basic(optional = false)
    @Column(name = "Storage_Housekeeping")
    private String storageHousekeeping;
    @Basic(optional = false)
    @Column(name = "Storage_24in_Below_Ceiling")
    private String storage24inBelowCeiling;
    @Basic(optional = false)
    @Column(name = "Storage_18in_below_sprinklers")
    private String storage18inbelowsprinklers;
    @Basic(optional = false)
    @Column(name = "Storage_Under_Stairs")
    private String storageUnderStairs;
    @Basic(optional = false)
    @Column(name = "Storage_Close_Ignition_Source")
    private String storageCloseIgnitionSource;
    @Basic(optional = false)
    @Column(name = "Flammable_704_placards")
    private String flammable704placards;
    @Basic(optional = false)
    @Column(name = "Flammable_MSDS")
    private String flammableMSDS;
    @Basic(optional = false)
    @Column(name = "Flammable_Non_Smoking_Signs")
    private String flammableNonSmokingSigns;
    @Basic(optional = false)
    @Column(name = "Gasses_Compressed_Secured")
    private String gassesCompressedSecured;
    @Basic(optional = false)
    @Column(name = "Finish_4A403C_Fire_Extinguisher_within_30ft")
    private String finish4A403CFireExtinguisherwithin30ft;
    @Basic(optional = false)
    @Column(name = "Finish_Approved_Spraybooth")
    private String finishApprovedSpraybooth;
    @Basic(optional = false)
    @Column(name = "Finish_Auto_Extinguishing_Inspected_Annually")
    private String finishAutoExtinguishingInspectedAnnually;
    @Basic(optional = false)
    @Column(name = "Finish_Warning_Smoking_Signs")
    private String finishWarningSmokingSigns;
    @Basic(optional = false)
    @Column(name = "Sprinklers_Annual_Service")
    private String sprinklersAnnualService;
    @Basic(optional = false)
    @Column(name = "Sprinklers_Date_Service")
    @Temporal(TemporalType.DATE)
    private Date sprinklersDateService;
    @Basic(optional = false)
    @Column(name = "Sprinklers_Access")
    private String sprinklersAccess;
    @Basic(optional = false)
    @Column(name = "Sprinklers_Standpipe_Sticker_on_Door")
    private String sprinklersStandpipeStickeronDoor;
    @Basic(optional = false)
    @Column(name = "Sprinklers_Sprinkler_Room_Identified")
    private String sprinklersSprinklerRoomIdentified;
    @Basic(optional = false)
    @Column(name = "Sprinklers_Riser_Location")
    private String sprinklersRiserLocation;
    @Basic(optional = false)
    @Column(name = "HES_Service_Within_6_Months")
    private String hESServiceWithin6Months;
    @Basic(optional = false)
    @Column(name = "HES_Last_Service_Date")
    @Temporal(TemporalType.DATE)
    private Date hESLastServiceDate;
    @Basic(optional = false)
    @Column(name = "HES_Access_Remote_Pull")
    private String hESAccessRemotePull;
    @Basic(optional = false)
    @Column(name = "HES_Clean")
    private String hESClean;
    @Basic(optional = false)
    @Column(name = "HES_K_Class_Extinguisher")
    private String hESKClassExtinguisher;
    @Basic(optional = false)
    @Column(name = "HES_Nozzle_Condition")
    private String hESNozzleCondition;
    @Basic(optional = false)
    @Column(name = "HES_Filters_Place")
    private String hESFiltersPlace;
    @Basic(optional = false)
    @Column(name = "Occupation_Load")
    private String occupationLoad;
    @Basic(optional = false)
    @Column(name = "Address_Visible_Legible")
    private String addressVisibleLegible;
    @Basic(optional = false)
    @Column(name = "FDA_Mait_Lubrication")
    private String fDAMaitLubrication;
    @Basic(optional = false)
    @Column(name = "FDA_Knox_Box_Keys_Current")
    private String fDAKnoxBoxKeysCurrent;
    @Basic(optional = false)
    @Column(name = "FDA_Knox_Box_Location")
    private String fDAKnoxBoxLocation;
    @Basic(optional = false)
    @Column(name = "FDC_Place")
    private String fDCPlace;
    @Basic(optional = false)
    @Column(name = "FDC_Identified")
    private String fDCIdentified;
    @Basic(optional = false)
    @Column(name = "FDC_Access_Unobstructed")
    private String fDCAccessUnobstructed;
    @Basic(optional = false)
    @Column(name = "FDC_Location")
    private String fDCLocation;
    @Basic(optional = false)
    @Column(name = "Elevator_keys")
    private String elevatorkeys;
    @Basic(optional = false)
    @Column(name = "Propane_Placards")
    private String propanePlacards;
    @Basic(optional = false)
    @Column(name = "Propane_Permit")
    private String propanePermit;
    @Basic(optional = false)
    @Column(name = "Propane_Impact_Bollards")
    private String propaneImpactBollards;
    @Basic(optional = false)
    @Column(name = "Other_Violations")
    private String otherViolations;
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

    public InspectionReport() {
    }

    public InspectionReport(InspectionReportPK inspectionReportPK) {
        this.inspectionReportPK = inspectionReportPK;
    }

    public InspectionReport(InspectionReportPK inspectionReportPK, int pFANumber, String panelFire, String comments, String eDoorObstructions, String eDoorLocksPanicHardware, String eSignExitSigns, String eSignEmergencyLights, String fDoorFireDoorsMaintainedorclosedfully, String fDoorUnapprovedOpenDevices, String fDoorClearObstructions, String extinguishersMinimum2AIOBC, String extinguishersMax75ftTravel, String extinguishersAnnualInspection, String extinguisersAccess, String electricExtensionCords, String electricMultiPlugAdapters, String electricOpenBoxesSwitches, String electricOpeningsElectricalPanel, String electric36inClearanceStorage, String storageHousekeeping, String storage24inBelowCeiling, String storage18inbelowsprinklers, String storageUnderStairs, String storageCloseIgnitionSource, String flammable704placards, String flammableMSDS, String flammableNonSmokingSigns, String gassesCompressedSecured, String finish4A403CFireExtinguisherwithin30ft, String finishApprovedSpraybooth, String finishAutoExtinguishingInspectedAnnually, String finishWarningSmokingSigns, String sprinklersAnnualService, Date sprinklersDateService, String sprinklersAccess, String sprinklersStandpipeStickeronDoor, String sprinklersSprinklerRoomIdentified, String sprinklersRiserLocation, String hESServiceWithin6Months, Date hESLastServiceDate, String hESAccessRemotePull, String hESClean, String hESKClassExtinguisher, String hESNozzleCondition, String hESFiltersPlace, String occupationLoad, String addressVisibleLegible, String fDAMaitLubrication, String fDAKnoxBoxKeysCurrent, String fDAKnoxBoxLocation, String fDCPlace, String fDCIdentified, String fDCAccessUnobstructed, String fDCLocation, String elevatorkeys, String propanePlacards, String propanePermit, String propaneImpactBollards, String otherViolations) {
        this.inspectionReportPK = inspectionReportPK;
        this.pFANumber = pFANumber;
        this.panelFire = panelFire;
        this.comments = comments;
        this.eDoorObstructions = eDoorObstructions;
        this.eDoorLocksPanicHardware = eDoorLocksPanicHardware;
        this.eSignExitSigns = eSignExitSigns;
        this.eSignEmergencyLights = eSignEmergencyLights;
        this.fDoorFireDoorsMaintainedorclosedfully = fDoorFireDoorsMaintainedorclosedfully;
        this.fDoorUnapprovedOpenDevices = fDoorUnapprovedOpenDevices;
        this.fDoorClearObstructions = fDoorClearObstructions;
        this.extinguishersMinimum2AIOBC = extinguishersMinimum2AIOBC;
        this.extinguishersMax75ftTravel = extinguishersMax75ftTravel;
        this.extinguishersAnnualInspection = extinguishersAnnualInspection;
        this.extinguisersAccess = extinguisersAccess;
        this.electricExtensionCords = electricExtensionCords;
        this.electricMultiPlugAdapters = electricMultiPlugAdapters;
        this.electricOpenBoxesSwitches = electricOpenBoxesSwitches;
        this.electricOpeningsElectricalPanel = electricOpeningsElectricalPanel;
        this.electric36inClearanceStorage = electric36inClearanceStorage;
        this.storageHousekeeping = storageHousekeeping;
        this.storage24inBelowCeiling = storage24inBelowCeiling;
        this.storage18inbelowsprinklers = storage18inbelowsprinklers;
        this.storageUnderStairs = storageUnderStairs;
        this.storageCloseIgnitionSource = storageCloseIgnitionSource;
        this.flammable704placards = flammable704placards;
        this.flammableMSDS = flammableMSDS;
        this.flammableNonSmokingSigns = flammableNonSmokingSigns;
        this.gassesCompressedSecured = gassesCompressedSecured;
        this.finish4A403CFireExtinguisherwithin30ft = finish4A403CFireExtinguisherwithin30ft;
        this.finishApprovedSpraybooth = finishApprovedSpraybooth;
        this.finishAutoExtinguishingInspectedAnnually = finishAutoExtinguishingInspectedAnnually;
        this.finishWarningSmokingSigns = finishWarningSmokingSigns;
        this.sprinklersAnnualService = sprinklersAnnualService;
        this.sprinklersDateService = sprinklersDateService;
        this.sprinklersAccess = sprinklersAccess;
        this.sprinklersStandpipeStickeronDoor = sprinklersStandpipeStickeronDoor;
        this.sprinklersSprinklerRoomIdentified = sprinklersSprinklerRoomIdentified;
        this.sprinklersRiserLocation = sprinklersRiserLocation;
        this.hESServiceWithin6Months = hESServiceWithin6Months;
        this.hESLastServiceDate = hESLastServiceDate;
        this.hESAccessRemotePull = hESAccessRemotePull;
        this.hESClean = hESClean;
        this.hESKClassExtinguisher = hESKClassExtinguisher;
        this.hESNozzleCondition = hESNozzleCondition;
        this.hESFiltersPlace = hESFiltersPlace;
        this.occupationLoad = occupationLoad;
        this.addressVisibleLegible = addressVisibleLegible;
        this.fDAMaitLubrication = fDAMaitLubrication;
        this.fDAKnoxBoxKeysCurrent = fDAKnoxBoxKeysCurrent;
        this.fDAKnoxBoxLocation = fDAKnoxBoxLocation;
        this.fDCPlace = fDCPlace;
        this.fDCIdentified = fDCIdentified;
        this.fDCAccessUnobstructed = fDCAccessUnobstructed;
        this.fDCLocation = fDCLocation;
        this.elevatorkeys = elevatorkeys;
        this.propanePlacards = propanePlacards;
        this.propanePermit = propanePermit;
        this.propaneImpactBollards = propaneImpactBollards;
        this.otherViolations = otherViolations;
    }

    public InspectionReport(int propertyID, Date inspDt) {
        this.inspectionReportPK = new InspectionReportPK(propertyID, inspDt);
    }

    public InspectionReportPK getInspectionReportPK() {
        return inspectionReportPK;
    }

    public void setInspectionReportPK(InspectionReportPK inspectionReportPK) {
        this.inspectionReportPK = inspectionReportPK;
    }

    public int getPFANumber() {
        return pFANumber;
    }

    public void setPFANumber(int pFANumber) {
        this.pFANumber = pFANumber;
    }

    public String getHazardClass() {
        return hazardClass;
    }

    public void setHazardClass(String hazardClass) {
        this.hazardClass = hazardClass;
    }

    public String getPanelFire() {
        return panelFire;
    }

    public void setPanelFire(String panelFire) {
        this.panelFire = panelFire;
    }

    public String getPanelActive() {
        return panelActive;
    }

    public void setPanelActive(String panelActive) {
        this.panelActive = panelActive;
    }

    public String getPanelLocation() {
        return panelLocation;
    }

    public void setPanelLocation(String panelLocation) {
        this.panelLocation = panelLocation;
    }

    public String getPanelNormal() {
        return panelNormal;
    }

    public void setPanelNormal(String panelNormal) {
        this.panelNormal = panelNormal;
    }

    public String getINCorrected() {
        return iNCorrected;
    }

    public void setINCorrected(String iNCorrected) {
        this.iNCorrected = iNCorrected;
    }

    public String getINViolations() {
        return iNViolations;
    }

    public void setINViolations(String iNViolations) {
        this.iNViolations = iNViolations;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getEDoorObstructions() {
        return eDoorObstructions;
    }

    public void setEDoorObstructions(String eDoorObstructions) {
        this.eDoorObstructions = eDoorObstructions;
    }

    public String getEDoorLocksPanicHardware() {
        return eDoorLocksPanicHardware;
    }

    public void setEDoorLocksPanicHardware(String eDoorLocksPanicHardware) {
        this.eDoorLocksPanicHardware = eDoorLocksPanicHardware;
    }

    public String getESignExitSigns() {
        return eSignExitSigns;
    }

    public void setESignExitSigns(String eSignExitSigns) {
        this.eSignExitSigns = eSignExitSigns;
    }

    public String getESignEmergencyLights() {
        return eSignEmergencyLights;
    }

    public void setESignEmergencyLights(String eSignEmergencyLights) {
        this.eSignEmergencyLights = eSignEmergencyLights;
    }

    public String getFDoorFireDoorsMaintainedorclosedfully() {
        return fDoorFireDoorsMaintainedorclosedfully;
    }

    public void setFDoorFireDoorsMaintainedorclosedfully(String fDoorFireDoorsMaintainedorclosedfully) {
        this.fDoorFireDoorsMaintainedorclosedfully = fDoorFireDoorsMaintainedorclosedfully;
    }

    public String getFDoorUnapprovedOpenDevices() {
        return fDoorUnapprovedOpenDevices;
    }

    public void setFDoorUnapprovedOpenDevices(String fDoorUnapprovedOpenDevices) {
        this.fDoorUnapprovedOpenDevices = fDoorUnapprovedOpenDevices;
    }

    public String getFDoorClearObstructions() {
        return fDoorClearObstructions;
    }

    public void setFDoorClearObstructions(String fDoorClearObstructions) {
        this.fDoorClearObstructions = fDoorClearObstructions;
    }

    public String getExtinguishersMinimum2AIOBC() {
        return extinguishersMinimum2AIOBC;
    }

    public void setExtinguishersMinimum2AIOBC(String extinguishersMinimum2AIOBC) {
        this.extinguishersMinimum2AIOBC = extinguishersMinimum2AIOBC;
    }

    public String getExtinguishersMax75ftTravel() {
        return extinguishersMax75ftTravel;
    }

    public void setExtinguishersMax75ftTravel(String extinguishersMax75ftTravel) {
        this.extinguishersMax75ftTravel = extinguishersMax75ftTravel;
    }

    public String getExtinguishersAnnualInspection() {
        return extinguishersAnnualInspection;
    }

    public void setExtinguishersAnnualInspection(String extinguishersAnnualInspection) {
        this.extinguishersAnnualInspection = extinguishersAnnualInspection;
    }

    public String getExtinguisersAccess() {
        return extinguisersAccess;
    }

    public void setExtinguisersAccess(String extinguisersAccess) {
        this.extinguisersAccess = extinguisersAccess;
    }

    public String getElectricExtensionCords() {
        return electricExtensionCords;
    }

    public void setElectricExtensionCords(String electricExtensionCords) {
        this.electricExtensionCords = electricExtensionCords;
    }

    public String getElectricMultiPlugAdapters() {
        return electricMultiPlugAdapters;
    }

    public void setElectricMultiPlugAdapters(String electricMultiPlugAdapters) {
        this.electricMultiPlugAdapters = electricMultiPlugAdapters;
    }

    public String getElectricOpenBoxesSwitches() {
        return electricOpenBoxesSwitches;
    }

    public void setElectricOpenBoxesSwitches(String electricOpenBoxesSwitches) {
        this.electricOpenBoxesSwitches = electricOpenBoxesSwitches;
    }

    public String getElectricOpeningsElectricalPanel() {
        return electricOpeningsElectricalPanel;
    }

    public void setElectricOpeningsElectricalPanel(String electricOpeningsElectricalPanel) {
        this.electricOpeningsElectricalPanel = electricOpeningsElectricalPanel;
    }

    public String getElectric36inClearanceStorage() {
        return electric36inClearanceStorage;
    }

    public void setElectric36inClearanceStorage(String electric36inClearanceStorage) {
        this.electric36inClearanceStorage = electric36inClearanceStorage;
    }

    public String getStorageHousekeeping() {
        return storageHousekeeping;
    }

    public void setStorageHousekeeping(String storageHousekeeping) {
        this.storageHousekeeping = storageHousekeeping;
    }

    public String getStorage24inBelowCeiling() {
        return storage24inBelowCeiling;
    }

    public void setStorage24inBelowCeiling(String storage24inBelowCeiling) {
        this.storage24inBelowCeiling = storage24inBelowCeiling;
    }

    public String getStorage18inbelowsprinklers() {
        return storage18inbelowsprinklers;
    }

    public void setStorage18inbelowsprinklers(String storage18inbelowsprinklers) {
        this.storage18inbelowsprinklers = storage18inbelowsprinklers;
    }

    public String getStorageUnderStairs() {
        return storageUnderStairs;
    }

    public void setStorageUnderStairs(String storageUnderStairs) {
        this.storageUnderStairs = storageUnderStairs;
    }

    public String getStorageCloseIgnitionSource() {
        return storageCloseIgnitionSource;
    }

    public void setStorageCloseIgnitionSource(String storageCloseIgnitionSource) {
        this.storageCloseIgnitionSource = storageCloseIgnitionSource;
    }

    public String getFlammable704placards() {
        return flammable704placards;
    }

    public void setFlammable704placards(String flammable704placards) {
        this.flammable704placards = flammable704placards;
    }

    public String getFlammableMSDS() {
        return flammableMSDS;
    }

    public void setFlammableMSDS(String flammableMSDS) {
        this.flammableMSDS = flammableMSDS;
    }

    public String getFlammableNonSmokingSigns() {
        return flammableNonSmokingSigns;
    }

    public void setFlammableNonSmokingSigns(String flammableNonSmokingSigns) {
        this.flammableNonSmokingSigns = flammableNonSmokingSigns;
    }

    public String getGassesCompressedSecured() {
        return gassesCompressedSecured;
    }

    public void setGassesCompressedSecured(String gassesCompressedSecured) {
        this.gassesCompressedSecured = gassesCompressedSecured;
    }

    public String getFinish4A403CFireExtinguisherwithin30ft() {
        return finish4A403CFireExtinguisherwithin30ft;
    }

    public void setFinish4A403CFireExtinguisherwithin30ft(String finish4A403CFireExtinguisherwithin30ft) {
        this.finish4A403CFireExtinguisherwithin30ft = finish4A403CFireExtinguisherwithin30ft;
    }

    public String getFinishApprovedSpraybooth() {
        return finishApprovedSpraybooth;
    }

    public void setFinishApprovedSpraybooth(String finishApprovedSpraybooth) {
        this.finishApprovedSpraybooth = finishApprovedSpraybooth;
    }

    public String getFinishAutoExtinguishingInspectedAnnually() {
        return finishAutoExtinguishingInspectedAnnually;
    }

    public void setFinishAutoExtinguishingInspectedAnnually(String finishAutoExtinguishingInspectedAnnually) {
        this.finishAutoExtinguishingInspectedAnnually = finishAutoExtinguishingInspectedAnnually;
    }

    public String getFinishWarningSmokingSigns() {
        return finishWarningSmokingSigns;
    }

    public void setFinishWarningSmokingSigns(String finishWarningSmokingSigns) {
        this.finishWarningSmokingSigns = finishWarningSmokingSigns;
    }

    public String getSprinklersAnnualService() {
        return sprinklersAnnualService;
    }

    public void setSprinklersAnnualService(String sprinklersAnnualService) {
        this.sprinklersAnnualService = sprinklersAnnualService;
    }

    public Date getSprinklersDateService() {
        return sprinklersDateService;
    }

    public void setSprinklersDateService(Date sprinklersDateService) {
        this.sprinklersDateService = sprinklersDateService;
    }

    public String getSprinklersAccess() {
        return sprinklersAccess;
    }

    public void setSprinklersAccess(String sprinklersAccess) {
        this.sprinklersAccess = sprinklersAccess;
    }

    public String getSprinklersStandpipeStickeronDoor() {
        return sprinklersStandpipeStickeronDoor;
    }

    public void setSprinklersStandpipeStickeronDoor(String sprinklersStandpipeStickeronDoor) {
        this.sprinklersStandpipeStickeronDoor = sprinklersStandpipeStickeronDoor;
    }

    public String getSprinklersSprinklerRoomIdentified() {
        return sprinklersSprinklerRoomIdentified;
    }

    public void setSprinklersSprinklerRoomIdentified(String sprinklersSprinklerRoomIdentified) {
        this.sprinklersSprinklerRoomIdentified = sprinklersSprinklerRoomIdentified;
    }

    public String getSprinklersRiserLocation() {
        return sprinklersRiserLocation;
    }

    public void setSprinklersRiserLocation(String sprinklersRiserLocation) {
        this.sprinklersRiserLocation = sprinklersRiserLocation;
    }

    public String getHESServiceWithin6Months() {
        return hESServiceWithin6Months;
    }

    public void setHESServiceWithin6Months(String hESServiceWithin6Months) {
        this.hESServiceWithin6Months = hESServiceWithin6Months;
    }

    public Date getHESLastServiceDate() {
        return hESLastServiceDate;
    }

    public void setHESLastServiceDate(Date hESLastServiceDate) {
        this.hESLastServiceDate = hESLastServiceDate;
    }

    public String getHESAccessRemotePull() {
        return hESAccessRemotePull;
    }

    public void setHESAccessRemotePull(String hESAccessRemotePull) {
        this.hESAccessRemotePull = hESAccessRemotePull;
    }

    public String getHESClean() {
        return hESClean;
    }

    public void setHESClean(String hESClean) {
        this.hESClean = hESClean;
    }

    public String getHESKClassExtinguisher() {
        return hESKClassExtinguisher;
    }

    public void setHESKClassExtinguisher(String hESKClassExtinguisher) {
        this.hESKClassExtinguisher = hESKClassExtinguisher;
    }

    public String getHESNozzleCondition() {
        return hESNozzleCondition;
    }

    public void setHESNozzleCondition(String hESNozzleCondition) {
        this.hESNozzleCondition = hESNozzleCondition;
    }

    public String getHESFiltersPlace() {
        return hESFiltersPlace;
    }

    public void setHESFiltersPlace(String hESFiltersPlace) {
        this.hESFiltersPlace = hESFiltersPlace;
    }

    public String getOccupationLoad() {
        return occupationLoad;
    }

    public void setOccupationLoad(String occupationLoad) {
        this.occupationLoad = occupationLoad;
    }

    public String getAddressVisibleLegible() {
        return addressVisibleLegible;
    }

    public void setAddressVisibleLegible(String addressVisibleLegible) {
        this.addressVisibleLegible = addressVisibleLegible;
    }

    public String getFDAMaitLubrication() {
        return fDAMaitLubrication;
    }

    public void setFDAMaitLubrication(String fDAMaitLubrication) {
        this.fDAMaitLubrication = fDAMaitLubrication;
    }

    public String getFDAKnoxBoxKeysCurrent() {
        return fDAKnoxBoxKeysCurrent;
    }

    public void setFDAKnoxBoxKeysCurrent(String fDAKnoxBoxKeysCurrent) {
        this.fDAKnoxBoxKeysCurrent = fDAKnoxBoxKeysCurrent;
    }

    public String getFDAKnoxBoxLocation() {
        return fDAKnoxBoxLocation;
    }

    public void setFDAKnoxBoxLocation(String fDAKnoxBoxLocation) {
        this.fDAKnoxBoxLocation = fDAKnoxBoxLocation;
    }

    public String getFDCPlace() {
        return fDCPlace;
    }

    public void setFDCPlace(String fDCPlace) {
        this.fDCPlace = fDCPlace;
    }

    public String getFDCIdentified() {
        return fDCIdentified;
    }

    public void setFDCIdentified(String fDCIdentified) {
        this.fDCIdentified = fDCIdentified;
    }

    public String getFDCAccessUnobstructed() {
        return fDCAccessUnobstructed;
    }

    public void setFDCAccessUnobstructed(String fDCAccessUnobstructed) {
        this.fDCAccessUnobstructed = fDCAccessUnobstructed;
    }

    public String getFDCLocation() {
        return fDCLocation;
    }

    public void setFDCLocation(String fDCLocation) {
        this.fDCLocation = fDCLocation;
    }

    public String getElevatorkeys() {
        return elevatorkeys;
    }

    public void setElevatorkeys(String elevatorkeys) {
        this.elevatorkeys = elevatorkeys;
    }

    public String getPropanePlacards() {
        return propanePlacards;
    }

    public void setPropanePlacards(String propanePlacards) {
        this.propanePlacards = propanePlacards;
    }

    public String getPropanePermit() {
        return propanePermit;
    }

    public void setPropanePermit(String propanePermit) {
        this.propanePermit = propanePermit;
    }

    public String getPropaneImpactBollards() {
        return propaneImpactBollards;
    }

    public void setPropaneImpactBollards(String propaneImpactBollards) {
        this.propaneImpactBollards = propaneImpactBollards;
    }

    public String getOtherViolations() {
        return otherViolations;
    }

    public void setOtherViolations(String otherViolations) {
        this.otherViolations = otherViolations;
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
        hash += (inspectionReportPK != null ? inspectionReportPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InspectionReport)) {
            return false;
        }
        InspectionReport other = (InspectionReport) object;
        if ((this.inspectionReportPK == null && other.inspectionReportPK != null) || (this.inspectionReportPK != null && !this.inspectionReportPK.equals(other.inspectionReportPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonelh.database.InspectionReport[ inspectionReportPK=" + inspectionReportPK + " ]";
    }

}
