package teammates.ui.template;

import teammates.common.util.Url;




public class InstructorFeedbackResultsParticipantPanel implements Comparable<InstructorFeedbackResultsParticipantPanel>{
    protected boolean isGiver; // if false, then participant is a recipient
    protected String participantIdentifier; // email, team name, or %GENERAL%
    protected String name; 
    
    protected boolean isHasResponses;
    protected boolean isEmailValid;
    
    protected String profilePictureLink;
    
    protected InstructorFeedbackResultsModerationButton moderationButton;
    
    public String getParticipantIdentifier() {
        return participantIdentifier;
    }
    
    public void setParticipantIdentifier(String participantIdentifier) {
        this.participantIdentifier = participantIdentifier;
    }

    public boolean isGiver() {
        return isGiver;
    }

    public void setIsGiver(boolean isGiver) {
        this.isGiver = isGiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasResponses() {
        return isHasResponses;
    }

    public void setHasResponses(boolean isHasResponses) {
        this.isHasResponses = isHasResponses;
    }
    
    public boolean isEmailValid() {
        return isEmailValid;
    }

    public void setEmailValid(boolean isEmailValid) {
        this.isEmailValid = isEmailValid;
    }

    public String getProfilePictureLink() {
        return profilePictureLink;
    }

    public void setProfilePictureLink(Url profilePictureLink) {
        this.profilePictureLink = profilePictureLink != null ? profilePictureLink.toString()
                                                             : null;
    }

    public InstructorFeedbackResultsModerationButton getModerationButton() {
        return moderationButton;
    }

    public void setModerationButton(InstructorFeedbackResultsModerationButton moderationButton) {
        this.moderationButton = moderationButton;
    }


    @Override
    public int compareTo(InstructorFeedbackResultsParticipantPanel o) {
        if (isHasResponses != o.isHasResponses) {
            return isHasResponses ? -1 : 1;
        } else {
            return name.compareTo(o.name);
        }
    }
    
}
