package htlong.learn.youtube.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lhtlong/learn/youtube/data/model/ApiResponse;", "", "Search", "SuggestQuery", "Video", "presentation_debug"})
public abstract interface ApiResponse {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "", "query", "", "isHistory", "", "suggests", "", "(Ljava/lang/String;ZLjava/util/List;)V", "()Z", "getQuery", "()Ljava/lang/String;", "getSuggests", "()Ljava/util/List;", "setSuggests", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "presentation_debug"})
    public static final class SuggestQuery {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String query = null;
        private final boolean isHistory = false;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> suggests;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.ApiResponse.SuggestQuery copy(@org.jetbrains.annotations.NotNull()
        java.lang.String query, boolean isHistory, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> suggests) {
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
        
        public SuggestQuery(@org.jetbrains.annotations.NotNull()
        java.lang.String query, boolean isHistory, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> suggests) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getQuery() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isHistory() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getSuggests() {
            return null;
        }
        
        public final void setSuggests(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lhtlong/learn/youtube/data/model/ApiResponse$Video;", "", "status", "", "data", "Lhtlong/learn/youtube/data/model/VideoModel$Info;", "message", "", "(ILhtlong/learn/youtube/data/model/VideoModel$Info;Ljava/lang/String;)V", "getData", "()Lhtlong/learn/youtube/data/model/VideoModel$Info;", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "presentation_debug"})
    public static final class Video {
        private final int status = 0;
        @org.jetbrains.annotations.NotNull()
        private final htlong.learn.youtube.data.model.VideoModel.Info data = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.ApiResponse.Video copy(int status, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Info data, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
        
        public Video(int status, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.model.VideoModel.Info data, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getStatus() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Info component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.VideoModel.Info getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lhtlong/learn/youtube/data/model/ApiResponse$Search;", "", "status", "", "data", "", "Lhtlong/learn/youtube/data/model/VideoModel$Details;", "message", "", "(ILjava/util/List;Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "presentation_debug"})
    public static final class Search {
        private final int status = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> data = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.model.ApiResponse.Search copy(int status, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> data, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
        
        public Search(int status, @org.jetbrains.annotations.NotNull()
        java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> data, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getStatus() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<htlong.learn.youtube.data.model.VideoModel.Details> getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
}