package org.example;

import java.util.List;

public class ReplyService {

    ReplyData replyData = new ReplyData();
    List<List<String>> data = replyData.getData();

    public String reply(String message, ReplyType type) {

        // - null or blank -> "Please say something."
        if (message == null || message.isEmpty() || message.isBlank()){
            return "Please say something.";
        }

        // - For known messages, return exact string for each ReplyType.
        for (List<String> list : data) {
            if (list.get(0).equals(message)) {
                switch (type) {
                    case FORMAL:
                        return list.get(1);

                    case FRIENDLY:
                        return list.get(2);

                    case CONCISE:
                        return list.get(3);
                }
            }
        }

        // - For unknown messages, return the 'any other text' mapping.
        switch (type) {
            case FORMAL:
                return "Could you clarify your request?";

            case FRIENDLY:
                return "Could you tell me more?";

            case CONCISE:
                return "Please clarify.";
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }
}
