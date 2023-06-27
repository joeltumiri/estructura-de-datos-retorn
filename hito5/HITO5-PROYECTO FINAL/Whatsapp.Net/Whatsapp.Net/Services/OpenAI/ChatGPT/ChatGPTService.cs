﻿using OpenAI_API;
using OpenAI_API.Completions;
using System.Linq.Expressions;

namespace WhatsappNet.Api.Services.OpenAI.ChatGPT
{
    public class ChatGPTService: IChatGPTService
    {
        public async Task<string> Execute(string textUser)
        {
            try 
            {
                string apiKey = "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";
                var openAiService = new OpenAIAPI(apiKey);

                var completion = new CompletionRequest
                {
                    Prompt = textUser,
                    Model = "text-davinci-003",
                    NumChoicesPerPrompt = 1,
                    MaxTokens = 200,
                };
                var result = await openAiService.Completions.CreateCompletionAsync(completion);

                if (result != null && result.Completions.Count > 0)
                    return result.Completions[0].Text;

                return "Lo siento, sucedio un problema, intentalo mas tarde.";
            }
            catch(Exception e)
            {
                return "Lo siento, sucedio un problema, intentalo mas tarde.";
            }
            
        }
        
    }
}

