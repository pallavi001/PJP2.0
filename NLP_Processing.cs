using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DateTimeCalculator
{
    class NLP_Processing
    {
        private Dictionary<string, string> phrases;

        public NLP_Processing()
        {
            phrases = new Dictionary<string, string>();
            InitMap();
        }

        private void InitMap()
        {
            DateTime today = DateTime.Today;
            phrases.Add("today", today.ToShortDateString());
            phrases.Add("tomorrow", Options.AddDaysInDate(today, 1));
            phrases.Add("yesterday", Options.SubtractDaysInDate(today, 1));
            phrases.Add("last week", Options.SubtractWeeksInDate(today, 1));
            phrases.Add("previous week", phrases["last week"]);
            phrases.Add("next week", Options.AddWeeksInDate(today, 1));
            phrases.Add("last month", Options.SubtractMonthsInDate(today, 1));
            phrases.Add("next month", Options.AddMonthsInDate(today, 1));
            phrases.Add("last year", Options.SubtractYearsInDate(today, 1));
            phrases.Add("next year", Options.AddYearsInDate(today, 1));
            phrases.Add("month after", phrases["next month"]);
            phrases.Add("month before", phrases["last month"]);
            phrases.Add("day after tomorrow", Options.AddDaysInDate(today, 2));
            phrases.Add("day before yesterday", Options.SubtractDaysInDate(today, 2));

        }

        public string SearchPhrase(string phrase)
        {
            if (phrases.ContainsKey(phrase))
                return phrases[phrase];
            return null;
        }

    }
}