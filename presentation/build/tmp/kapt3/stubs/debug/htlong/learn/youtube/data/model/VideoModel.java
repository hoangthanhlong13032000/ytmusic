package htlong.learn.youtube.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel;", "", "Avatar", "Channel", "Details", "Info", "Media", "Stats", "Thumbnail", "presentation_debug"})
public abstract interface VideoModel {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003JS\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel$Info;", "", "videos", "", "Lhtlong/learn/youtube/data/model/VideoModel$Media;", "videoOnly", "audioOnly", "recommends", "Lhtlong/learn/youtube/data/model/VideoModel$Details;", "details", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lhtlong/learn/youtube/data/model/VideoModel$Details;)V", "getAudioOnly", "()Ljava/util/List;", "getDetails", "()Lhtlong/learn/youtube/data/model/VideoModel$Details;", "getRecommends", "getVideoOnly", "getVideos", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "presentation_debug"})
    public static final class Info {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> videos = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> videoOnly = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> audioOnly = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> recommends = null;
        @org.jetbrains.annotations.NotNull()
        private final htlong.learn.youtube.data.model.VideoModel.Details details = null;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Info copy(@org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> videos, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> videoOnly, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> audioOnly, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> recommends, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Details details) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Info(@org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> videos, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> videoOnly, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> audioOnly, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> recommends, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Details details) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> getVideos() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> getVideoOnly() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Media> getAudioOnly() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> getRecommends() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Details component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Details getDetails() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\fH\u00c6\u0003J\t\u0010#\u001a\u00020\fH\u00c6\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u00c6\u0001J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\tH\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016\u00a8\u0006)"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel$Media;", "", "url", "", "mimeType", "container", "quality", "audioQuality", "width", "", "height", "hasAudio", "", "hasVideo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V", "getAudioQuality", "()Ljava/lang/String;", "getContainer", "getHasAudio", "()Z", "getHasVideo", "getHeight", "()I", "getMimeType", "getQuality", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "presentation_debug"})
    public static final class Media {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String mimeType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String container = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String quality = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String audioQuality = null;
        private final int width = 0;
        private final int height = 0;
        private final boolean hasAudio = false;
        private final boolean hasVideo = false;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Media copy(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String mimeType, @org.jetbrains.annotations.NotNull()
        java.lang.String container, @org.jetbrains.annotations.NotNull()
        java.lang.String quality, @org.jetbrains.annotations.NotNull()
        java.lang.String audioQuality, int width, int height, boolean hasAudio, boolean hasVideo) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Media() {
            super();
        }
        
        public Media(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String mimeType, @org.jetbrains.annotations.NotNull()
        java.lang.String container, @org.jetbrains.annotations.NotNull()
        java.lang.String quality, @org.jetbrains.annotations.NotNull()
        java.lang.String audioQuality, int width, int height, boolean hasAudio, boolean hasVideo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMimeType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContainer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQuality() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAudioQuality() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final boolean getHasAudio() {
            return false;
        }
        
        public final boolean component9() {
            return false;
        }
        
        public final boolean getHasVideo() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0011H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\u000eH\u00c6\u0003J}\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u000202H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016\u00a8\u00064"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel$Details;", "", "id", "", "source", "lengthInText", "lengthInSeconds", "title", "publishedTime", "href", "thumbnails", "", "Lhtlong/learn/youtube/data/model/VideoModel$Thumbnail;", "channel", "Lhtlong/learn/youtube/data/model/VideoModel$Channel;", "description", "stats", "Lhtlong/learn/youtube/data/model/VideoModel$Stats;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhtlong/learn/youtube/data/model/VideoModel$Channel;Ljava/lang/String;Lhtlong/learn/youtube/data/model/VideoModel$Stats;)V", "getChannel", "()Lhtlong/learn/youtube/data/model/VideoModel$Channel;", "getDescription", "()Ljava/lang/String;", "getHref", "getId", "getLengthInSeconds", "getLengthInText", "getPublishedTime", "getSource", "getStats", "()Lhtlong/learn/youtube/data/model/VideoModel$Stats;", "getThumbnails", "()Ljava/util/List;", "getTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_debug"})
    public static final class Details {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String source = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lengthInText = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lengthInSeconds = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String publishedTime = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String href = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<htlong.learn.youtube.data.model.VideoModel.Thumbnail> thumbnails = null;
        @org.jetbrains.annotations.NotNull()
        private final htlong.learn.youtube.data.model.VideoModel.Channel channel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final htlong.learn.youtube.data.model.VideoModel.Stats stats = null;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Details copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.lang.String lengthInText, @org.jetbrains.annotations.NotNull()
        java.lang.String lengthInSeconds, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String publishedTime, @org.jetbrains.annotations.NotNull()
        java.lang.String href, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Thumbnail> thumbnails, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Channel channel, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Stats stats) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Details() {
            super();
        }
        
        public Details(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String source, @org.jetbrains.annotations.NotNull()
        java.lang.String lengthInText, @org.jetbrains.annotations.NotNull()
        java.lang.String lengthInSeconds, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String publishedTime, @org.jetbrains.annotations.NotNull()
        java.lang.String href, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Thumbnail> thumbnails, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Channel channel, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Stats stats) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSource() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLengthInText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLengthInSeconds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPublishedTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHref() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Thumbnail> component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Thumbnail> getThumbnails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Channel component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Channel getChannel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Stats component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Stats getStats() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel$Thumbnail;", "", "url", "", "width", "", "height", "(Ljava/lang/String;II)V", "getHeight", "()I", "getUrl", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "presentation_debug"})
    public static final class Thumbnail {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        private final int width = 0;
        private final int height = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Thumbnail copy(@org.jetbrains.annotations.NotNull()
        java.lang.String url, int width, int height) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Thumbnail() {
            super();
        }
        
        public Thumbnail(@org.jetbrains.annotations.NotNull()
        java.lang.String url, int width, int height) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel$Stats;", "", "viewCount", "", "likeCount", "shareCount", "commentCount", "(IIII)V", "getCommentCount", "()I", "getLikeCount", "getShareCount", "getViewCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "presentation_debug"})
    public static final class Stats {
        private final int viewCount = 0;
        private final int likeCount = 0;
        private final int shareCount = 0;
        private final int commentCount = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Stats copy(int viewCount, int likeCount, int shareCount, int commentCount) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Stats() {
            super();
        }
        
        public Stats(int viewCount, int likeCount, int shareCount, int commentCount) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getViewCount() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getLikeCount() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getShareCount() {
            return 0;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getCommentCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel$Channel;", "", "id", "", "title", "url", "avatar", "Lhtlong/learn/youtube/data/model/VideoModel$Avatar;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhtlong/learn/youtube/data/model/VideoModel$Avatar;)V", "getAvatar", "()Lhtlong/learn/youtube/data/model/VideoModel$Avatar;", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_debug"})
    public static final class Channel {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        @org.jetbrains.annotations.NotNull()
        private final htlong.learn.youtube.data.model.VideoModel.Avatar avatar = null;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Channel copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Avatar avatar) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Channel() {
            super();
        }
        
        public Channel(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Avatar avatar) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Avatar component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Avatar getAvatar() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lhtlong/learn/youtube/data/model/VideoModel$Avatar;", "", "large", "", "medium", "thumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "getThumb", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_debug"})
    public static final class Avatar {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String large = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String medium = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String thumb = null;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Avatar copy(@org.jetbrains.annotations.NotNull()
        java.lang.String large, @org.jetbrains.annotations.NotNull()
        java.lang.String medium, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Avatar() {
            super();
        }
        
        public Avatar(@org.jetbrains.annotations.NotNull()
        java.lang.String large, @org.jetbrains.annotations.NotNull()
        java.lang.String medium, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLarge() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMedium() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getThumb() {
            return null;
        }
    }
}