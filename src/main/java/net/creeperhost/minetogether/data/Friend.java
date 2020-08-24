package net.creeperhost.minetogether.data;

import net.creeperhost.minetogether.Profile;

public class Friend
{
    private final Profile profile;
    private final String name;
    private final String code;
    private final boolean accepted;
    
    public Friend(Profile profile, String name, String code, boolean accepted)
    {
        this.profile = profile;
        this.name = name;
        this.code = code;
        this.accepted = accepted;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean isAccepted()
    {
        return accepted;
    }

    public Profile getProfile() {
        return profile;
    }
}