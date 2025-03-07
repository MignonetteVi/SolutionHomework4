package Part2;

class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);
        chatService.sendMessage("Message from Part2.LegacyChatService");
    }
}
