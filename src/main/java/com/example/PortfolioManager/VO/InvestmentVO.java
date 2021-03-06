package com.example.PortfolioManager.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestmentVO {
    private float totalAmount;
    private HashMap<String, Float> investments;
    private HashMap<String, String> gainers;
    private HashMap<String, String> losers;
}
