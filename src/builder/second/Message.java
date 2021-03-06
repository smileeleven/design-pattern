package builder.second;

import java.util.Date;

/**
 * 构建的消息对象
 * 有个静态内部类
 *
 * @author illusoryCloud
 */
public class Message {
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 发送者
     */
    private String from;
    /**
     * 接收者
     */
    private String to;
    /**
     * 时间
     */
    private Date time;


    @Override
    public String toString() {
        return "Message{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", time=" + time +
                '}';
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * 静态内部类 builder
     */
    public static class Builder {
        /**
         * 设置默认值
         */
        private String title = "未命名";
        private String content = "暂无内容";
        private String from = "unknow";
        private String to = "unknow";
        private Date time = new Date();

        /**
         * 设置消息标题
         *
         * @param title 要设置的标题
         * @return 返回Builder对象 以达到链式调用
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public Builder setTo(String to) {
            this.to = to;
            return this;
        }

        public Builder setTime(Date time) {
            this.time = time;
            return this;
        }

        public Message build() {
            Message message = new Message();
            message.title = title;
            message.content = content;
            message.from = from;
            message.to = to;
            message.time = time;
            return message;
        }

    }
}
