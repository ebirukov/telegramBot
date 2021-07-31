import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId

fun main(vararg args: String) {
    val bot = bot {
        token = args.first()
        dispatch {
            text {
                bot.sendMessage(ChatId.fromId(message.chat.id), text = "$text!")
            }
        }
    }
    bot.startPolling()
}