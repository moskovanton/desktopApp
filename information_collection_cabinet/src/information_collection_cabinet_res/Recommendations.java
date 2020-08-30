/*
* Рекомендации по обслуживанию
*/
package information_collection_cabinet_res;

import java.util.ArrayList;

public final class Recommendations {
    
    public static String FD1Recommendation(ArrayList<Way> way) {
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №1 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №2 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №3 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №4 не работает.";
        if (((Statistics.FD1Statistics(way) / (double)Statistics
                .FD2Statistics(way) * 100) < 70) && ((Statistics
                        .FD1Statistics(way) / (double)Statistics
                .FD3Statistics(way) * 100) < 70) && ((Statistics
                        .FD1Statistics(way) / (double)Statistics
                .FD4Statistics(way) * 100) < 70)) 
            return "Необходимо отрегулировать фотодатчик №1.";
        else return "Фотодатчик №1 отрегулирован корректно.";
    }
    
    public static String FD2Recommendation(ArrayList<Way> way) {
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №1 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №2 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №3 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №4 не работает.";
        if (((Statistics.FD2Statistics(way) / (double)Statistics
                .FD1Statistics(way) * 100) < 70) && ((Statistics
                        .FD2Statistics(way) / (double)Statistics
                .FD3Statistics(way) * 100) < 70) && ((Statistics
                        .FD2Statistics(way) / (double)Statistics
                .FD4Statistics(way) * 100) < 70)) 
            return "Необходимо отрегулировать фотодатчик №2.";
        else return "Фотодатчик №2 отрегулирован корректно.";
    }
    
    public static String FD3Recommendation(ArrayList<Way> way) {
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №1 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №2 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №3 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №4 не работает.";
        if (((Statistics.FD3Statistics(way) / (double)Statistics
                .FD1Statistics(way) * 100) < 70) && ((Statistics
                        .FD3Statistics(way) / (double)Statistics
                .FD2Statistics(way) * 100) < 70) && ((Statistics
                        .FD3Statistics(way) / (double)Statistics
                .FD4Statistics(way) * 100) < 70)) 
            return "Необходимо отрегулировать фотодатчик №3.";
        else return "Фотодатчик №3 отрегулирован корректно.";
    }
    
    public static String FD4Recommendation(ArrayList<Way> way) {
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №1 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №2 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №3 не работает.";
        if (Statistics.FD1Statistics(way) == 0) 
            return "Фотодатчик №4 не работает.";
        if (((Statistics.FD4Statistics(way) / (double)Statistics
                .FD1Statistics(way) * 100) < 70) && ((Statistics
                        .FD4Statistics(way) / (double)Statistics
                .FD2Statistics(way) * 100) < 70) && ((Statistics
                        .FD4Statistics(way) / (double)Statistics
                .FD3Statistics(way) * 100) < 70)) 
            return "Необходимо отрегулировать фотодатчик №4.";
        else return "Фотодатчик №4 отрегулирован корректно.";
    }
    
    public static String TrainLightRecommendation(ArrayList<Way> way) {
        if (Statistics.CloseASDStatistics(way) == 0) 
            return "Двери не открывались.";
        if (((Statistics.ROAZStatistics(way) / (double)Statistics
                .CloseASDStatistics(way) * 100) > 5)) 
            return "Необходимо проверить светильники на составах.";
        else return "Светильники на составах работают исправно.";
    }
    
    public static String RelayOCRecommendation(ArrayList<Way> way) {
            if (Statistics.CloseASDStatistics(way) == 0) 
            return "Двери не открывались.";
            return "При текущих характеристиках движения "
                    + "Реле Откр АСД и Реле Закр АСД отработает " 
                    + 1000000/Statistics.CloseASDStatistics(way) 
                    + " дней.";
    }
    
    public static String RelayOAZRecommendation(ArrayList<Way> way) {
            if (Statistics.ROAZStatistics(way) == 0) 
            return "КОАЗ не срабатывал.";
            return "При текущих характеристиках движения КОАЗ отработает " 
                    + 1000000/Statistics.ROAZStatistics(way) 
                    + " дней.";
    }
    
    public static String RelayNPRecommendation(ArrayList<Way> way) {
            if (Statistics.RNPStatistics(way) == 0) 
            return "ПР не срабатывало.";
            return "При текущих характеристиках движения ПР отработает " 
                    + 1000000/Statistics.RNPStatistics(way) 
                    + " дней.";
    }
    
}
