/**
 * ComponentKeys: 
 * @author Lucas Hall
 * @version Apr 26, 2016
 */

package capstonelh;


public enum ComponentKeys{
    
    //Field One
    OBSTRUCTION(100),
    HARDWARE(101),
    //Field Two
    EXIT_SIGNS_ILLUMINATED(110),
    EMERGENCY_LIGHTS_WORKING(111),
    //Field Three
    MAINTAINED_CLOSE_FULLY(120),
    UNAPPROVED_OPEN_DEVICES(121),
    CLEAR_OF_OBSTRUCTIONS(122),
    //Field Four
    MINIMUM_2A10BC(130),
    MAX_OF_75(131),
    ANNUAL_INSPECTION(132),
    FIRE_EXTINGUISHER_ACCESS(133),
    //Field Five
    EXTENSIONS_CORDS(140),
    MULTI_PLUG_ADAPTERS(141),
    OPEN_BOXES_SWITCHES(142),
    OPENINGS_IN_ELECTRICAL(143),
    CLEARANCE_FROM_STORAGE(144),
    //Field Six
    HOUSEKEEPING(150),
    BELOW_CEILING(151),
    BELOW_SPRINKLERS(152),
    UNDER_STAIRS(153),
    CLOSE_TO_IGNITION(154),
    //Field Seven
    FLAMMABLE_PLACARDS(160),
    MSDS_ON_PREMISES(161),
    NONSMOKING_SIGNS(162),
    //Field Eight
    SECURED(170),
    //Field Nine
    MINIMUM_4A40BC_FIRE(180),
    APPROVED_SPRAY_BOOTH(181),
    AUTO_EXTINGUISHING_SYSTEM(182),
    WELDING_HOTWORK_WARNING(183),
    //Field Ten
    ANNUAL_SERVICE(190),
    DATE_OF_LAST_SERVICE(191),
    SPRINKLER_STANDPIPE_ACCESS(192),
    STANDPIPE_STICKER(193),
    SPRINKLER_ROOM_IDENTIFIED(194),
    RISER_LOCATION(195),
    //Field Eleven
    SERVICE_WITHIN_6_MONTHS(200),
    LAST_SERVICE_DATE(201),
    ACCESS_TO_REMOTE(202),
    CLEAN(203),
    K_CLASS_EXTINGUISHER(204),
    NOZZLE_CONDITION(205),
    FILTERS_IN_PLACE(206),
    //Field Twelve
    POSTED_IN_PLACES(210),
    //Field Thirteen
    VISIBLE_AND_LEGIBLE(220),
    //Field Fourteen
    MAINT_LUBRICATION(230),
    KNOX_BOX_KEYS(231),
    KNOX_BOX_LOCATION(232),
    //Field Fifteen
    FDC_CAPS_IN_PLACE(240),
    FDC_IDENTIFIED(241),
    FDC_ACCESS_IS_UNOBSTRUCTED(242),
    //Field Sixteen
    OVERRIDE_KEYS_ON_SITE(250),
    //Field Seventeen
    PROPANE_PLACARDS(260),
    PERMIT_ON_SITE(261),
    IMPACT_BOLLARDS(262),
    //Field Eighteen
    OTHER_VIOLATIONS_NOTED(270);
    
    
    private final int value;
    
    ComponentKeys(int valueToSet){
        value = valueToSet;
    }
    
    public int getValue(){
        return value;
    }
}
