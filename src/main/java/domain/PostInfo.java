package domain;

public class PostInfo {

    public class Post {

        private int id;
        private int ownerId;
        private int fromId;
        private int createdBy;
        private int date;
        private String text;
        private int replyOwnerId;
        private int replyPostId;
        private boolean friendsOnly;
        private CommentsInfo commentsInfo;
        private Likes likesInfo;
        private RepostsInfo repostsInfo;
        private String type;
        private Location loc;
        private boolean canEdit;
        private boolean canDelete;
        private int signedId;
        private boolean isFavorite;

        public Location getLocation() {
            return loc;
        }

        public void setLocation(Location loc) {
            this.loc = loc;
        }

        public boolean isCanEdit() {
            return canEdit;
        }

        public void setCanEdit(boolean canEdit) {
            this.canEdit = canEdit;
        }

        public boolean isCanDelete() {
            return canDelete;
        }

        public void setCanDelete(boolean canDelete) {
        }

        public void comment(UserInfo user, String message) {
        }

        public void viewPost(UserInfo user) {
        }

        public void addToBookmarks(UserInfo user) {

        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(int ownerId) {
            this.ownerId = ownerId;
        }

        public int getFromId() {
            return fromId;
        }

        public void setFromId(int fromId) {
            this.fromId = fromId;
        }

        public int getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(int createdBy) {
            this.createdBy = createdBy;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getReplyOwnerId() {
            return replyOwnerId;
        }

        public void setReplyOwnerId(int replyOwnerId) {
            this.replyOwnerId = replyOwnerId;
        }

        public int getReplyPostId() {
            return replyPostId;
        }

        public void setReplyPostId(int replyPostId) {
            this.replyPostId = replyPostId;
        }

        public boolean isFriendsOnly() {
            return friendsOnly;
        }

        public void setFriendsOnly(boolean friendsOnly) {
            this.friendsOnly = friendsOnly;
        }

        public CommentsInfo getCommentsInfo() {
            return commentsInfo;
        }

        public void setCommentsInfo(CommentsInfo commentsInfo) {
            this.commentsInfo = commentsInfo;
        }

        public Likes getLikes() {
            return likesInfo;
        }

        public void setLikes (Likes likesInfo) {
            this.likesInfo = likesInfo;
        }

        public RepostsInfo getRepostsInfo() {
            return repostsInfo;
        }

        public void setRepostsInfo(RepostsInfo repostsInfo) {
            this.repostsInfo = repostsInfo;
        }

        public int getSignedId() {
            return signedId;
        }

        public void setSignedId(int signedId) {
            this.signedId = signedId;
        }

        public boolean isFavorite() {
            return isFavorite;
        }

        public void setFavorite(boolean favorite) {
            isFavorite = favorite;
        }
    }
}
