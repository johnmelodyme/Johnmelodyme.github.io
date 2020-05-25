//
//  ViewController.swift
//  John Melody Me
//
//  Created by John Melody on 26/05/2020.
//  Copyright © 2020 John Melody. All rights reserved.
//

import UIKit
import WebKit

class ViewController: UIViewController, WKUIDelegate{

    @IBOutlet var resume: WKWebView!
    
    func loadWebView() {
        let webconfig = WKWebViewConfiguration()
        resume = WKWebView(frame: .zero, configuration: webconfig)
        resume.uiDelegate = self
        view = resume
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let url = URL(string: "https://johnmelodyme.github.io")
        let request = URLRequest(url: url!)
        resume.load(request)
    }
}
