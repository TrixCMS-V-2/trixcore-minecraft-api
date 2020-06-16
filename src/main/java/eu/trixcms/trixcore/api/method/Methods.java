package eu.trixcms.trixcore.api.method;

public enum Methods {

    GET_BANNED_PLAYER("getBannedPlayers"),
    GET_PLAYER_LIST("getPlayerList"),
    GET_SERVER_INFO("getServerInfo"),
    GET_WHITELIST("getWhitelist"),
    IS_BANNED("isBanned"),
    IS_CONNECTED("isConnected"),
    REMOVE_SCHEDULED_COMMANDS("removeScheduledCommands"),
    RUN_COMMAND("runCommand"),
    RUN_SCHEDULED_COMMAND("runScheduledCommand"),
    SET_MOTD("setMotd"),
    GET_DATA("getData"),

    NONE("none")
	;

    private String commandSlug;

    private Methods(String commandSlug) {
        this.commandSlug = commandSlug;
    }

    public String getSlug() {
        return commandSlug;
    }
}
